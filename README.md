Docker Compose
A new module, spring-boot-docker-compose, provides integration with Docker Compose. When your app is starting up, the Docker Compose integration will look for a configuration file in the current working directory. The following files are supported:

compose.yaml

compose.yml

docker-compose.yaml

docker-compose.yml

To use a non-standard file, set the spring.docker.compose.file property.

By default, the services declared in the configuration file will be started up using docker compose up and connection details beans for those services will be added to the application context so that the services can be used without any further configuration. When the application stops, the services will then be shut down using docker compose down. This lifecycle management and the commands used to start up and shut down the services can be customized using the spring.docker.compose.lifecycle-management, spring.docker.compose.startup.command, and spring.docker.compose.shutdown.command configuration properties.

Please refer to the [reference documentation](https://docs.spring.io/spring-boot/docs/3.1.0/reference/html/features.html#features.docker-compose) for further details, including the list of services that are currently supported.

