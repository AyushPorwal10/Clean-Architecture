Restaurant Finder - Clean Architecture & DDD 
A modern Android application built with Kotlin and Jetpack Compose, demonstrating the implementation of Domain-Driven Design (DDD) and Clean Architecture principles.

 Project Overview
This project serves as a practical implementation of scalable architecture in Android. It focuses on separating concerns into three distinct layers: Presentation, Domain, and Data.

Key Features:
Clean Architecture: Strict separation of layers for high testability and maintainability.

Domain-Driven Design (DDD): Use of Value Classes (@JvmInline) and Domain Entities to enforce business rules.

Modern Tech Stack: 100% Jetpack Compose for UI and Hilt for Dependency Injection.

 Architecture Layers
1. Domain Layer
Contains Entities and Value Objects (like Rating, Price).
Defines Repository Interfaces (Contracts).
Contains Use Cases that handle specific business logic (e.g., GetAllRestaurantUseCase).


2. Data Layer
Implements the Domain interfaces.
Manages data sources (Local Room DB, Remote REST APIs, or Fake Data)
Handles Data Transfer Objects (DTOs) and Mappers.

3. Presentation Layer
Jetpack Compose: Declarative UI components.
MVVM: ViewModels managing UI State through StateFlow.
Use Case Injection: ViewModels interact only with Use Cases, keeping them thin and clean.


Tech Stack

Language: Kotlin 
UI: Jetpack Compose 
Dependency Injection: Hilt 

Architecture: Clean Architecture + MVVM 

 Folder Structure

data/: Repositories and Data Sources.

domain/: Models, Repositories (Interfaces), and UseCases.

presentation/: UI Components, Screens, and ViewModels.

di/: Hilt Modules for dependency binding.
