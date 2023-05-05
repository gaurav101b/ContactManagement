# Contact Manager API

This API allows you to manage contacts and their addresses. It provides the following endpoints:

## GET /contacts

Retrieves a list of all contacts.

## GET /contacts?zipCode={zipCode}

Retrieves a list of contacts with addresses in the specified zip code.

### Parameters

| Parameter | Required | Description |
|-----------|----------|-------------|
| zipCode   | Yes      | The zip code to search for. |

## POST /contacts

Creates a new contact.

### Request Body

| Field      | Required | Description |
|------------|----------|-------------|
| fullName   | Yes      | The full name of the contact. |
| dateOfBirth| Yes      | The date of birth of the contact in the format yyyy-MM-dd. |
| address    | No       | The address of the contact. |

If an address is provided, it should include the following fields:

| Field       | Required | Description |
|-------------|----------|-------------|
| addressLine | Yes      | The street address of the contact. |
| city        | Yes      | The city of the contact. |
| zipCode     | Yes      | The zip code of the contact. |


## Technologies Used

This API is built with Spring Boot and uses an H2 database to store data. It also uses Logback for logging.