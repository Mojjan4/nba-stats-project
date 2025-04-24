# NBA Stats Tracker

## Project Description
Welcome to the **NBA Stats Tracker** project! This is a full-stack application built with **React** on the frontend and **Java (Spring Boot)** on the backend. The app allows users to track and view NBA stats by integrating with the **RapidAPI NBA Stats API**.

This project is designed to provide real-time NBA statistics in a user-friendly interface, allowing for easy exploration of player stats, team performance, and more.

## What’s Been Done
- **Backend Setup**:
  - The backend is built using **Spring Boot** with Java 21, providing a robust and scalable architecture.
  - Essential endpoints for retrieving NBA stats have been created and are functioning as expected.
  - A **CI/CD pipeline** has been set up using **GitHub Actions**, ensuring that all code is tested and built automatically when changes are made.
  - Backend integration with **RapidAPI NBA Stats API** has been established, providing real-time NBA data.

- **Frontend Setup**:
  - The **React** frontend will be initialized, laying the foundation for a responsive and intuitive user interface.
  - Frontend design and UI component setup is yet to be completed.

- **CI/CD**:
  - A **continuous integration pipeline** has been established for the backend, ensuring automated testing and building with every commit or pull request.
  - Future enhancements include integration with the frontend once the backend is fully functional.

## Next Steps
- **Backend Enhancements**:
  - Finalize and test API endpoints to ensure accurate NBA stats are being fetched and displayed.
  - Add more complex features such as **team performance comparisons**, **player search**, and **statistical analysis**.
  - Ensure backend is optimized and scalable for large datasets and high traffic.

- **Frontend Development**:
  - Build out the user interface to display the NBA stats effectively.
  - Implement real-time data updates and interactive charts/graphs for better data visualization.
  - Integrate with the backend to fetch and display live stats from the API.
  - Frontend design and UI library selection are still to be decided.

- **Testing**:
  - Add more unit tests for the backend service layers and API controllers.
  - Set up comprehensive frontend tests to ensure the application functions correctly across different devices.

## How to Run the Project Locally

### Prerequisites
- **Java 21** (for the backend)
- **Maven** (for building the Java project)
- **Node.js** (for the frontend)
- **Git** (for cloning the repository)

### Running the Backend
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/nba-stats-project.git
   cd nba-stats-project/backend
2. Build and run the backend using Maven:
   ```bash
   mvn clean install
   mvn spring-boot:run

## Current Discussion:
- Frontend design and UI component setup are still pending.
- Enhancements to data visualization and real-time updates are planned for future development.