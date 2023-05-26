FROM openjdk:17-alpine AS builder
COPY . /source
WORKDIR /source
RUN ./gradlew bootJar

FROM openjdk:17-alpine
ARG app_version=DEV
ENV APP_VERSION=$app_version
COPY --from=builder /source/build/libs/wefine-server-1.0.jar /app/

RUN apk add ca-certificates

WORKDIR /app
EXPOSE 80

CMD ["java", "-jar", "scaffold-1.0.0.jar"]
