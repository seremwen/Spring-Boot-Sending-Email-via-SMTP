# Project Name - Spring Boot Sending Email via SMTP

## Overview
This Spring Boot project demonstrates how to send emails using the JavaMail Library via SMTP (Simple Mail Transfer Protocol). It provides a simple and effective way to incorporate email functionality into your Java applications.

## Features
- **Email Service:** Utilizes JavaMail Library to send emails.
- **SMTP Configuration:** Configures the application to use an SMTP server for sending emails.

## Technologies Used
- Spring Boot
- JavaMail Library



## Setup Instructions
Follow these steps to run the Spring Boot app for sending emails via SMTP:

1. Clone the repository:
    ```bash
    git clone https://github.com/seremwen/spring-boot-smtp-email.git
    cd spring-boot-smtp-email
    ```

2. Configure SMTP properties:
    - Open `src/main/resources/application.properties`.
    - Replace the placeholder values with your SMTP server details.

3. Run the app:
    ```bash
    ./mvnw spring-boot:run
    ```




## Additional Notes
- Ensure that you have Java and Maven installed on your machine.
- Customize the project according to your specific SMTP server requirements.
- You may need to allow access to less secure apps on your SMTP provider or configure two-factor authentication if applicable.

Feel free to adapt the project to your needs and explore additional features offered by the JavaMail Library and Spring Boot for advanced email functionality. If you encounter any issues or have suggestions, please refer to the documentation or open an issue on the project's repository. Happy coding!
