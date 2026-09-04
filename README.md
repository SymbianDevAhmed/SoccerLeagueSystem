# ⚽ Soccer League System

A Java Object-Oriented Programming project that simulates a simple soccer league system.

## 📌 Project Overview

The system manages soccer teams, players, matches, and goals using Java OOP concepts.

It allows the system to:

- Manage teams and their players.
- Manage matches between teams.
- Record goals and the players who scored them.
- Calculate team goals and points.
- Rank teams based on their points.
- Display the league results table.
- Display detailed information about matches and goals.

## 🏗️ Project Structure

The project contains exactly five Java classes:

```text
src
└── soccerleaguesystem
    ├── Player.java
    ├── Team.java
    ├── Goal.java
    ├── Match.java
    └── Schedule.java

👤 Player
Represents a player in the soccer league.
Attributes
- playerId - Player ID
- name - Player name
- position - Player position

🏆 Team
Represents a soccer team.
Attributes
- teamId - Team ID
- teamName - Team name
- totalGoals - Total goals scored
- points - Team points
- players - List of players

⚽ Goal
Represents a goal scored during a match.
Attributes
- matchId - Match identifier
- scorer - Player who scored
- minute - Minute when the goal was scored

🥅 Match
Represents a match between two teams.
Attributes
- matchId - Match ID
- homeTeam - Home team
- awayTeam - Away team
- goals - List of goals

📅 Schedule
Manages the soccer league schedule.
Responsibilities
- Store all teams.
- Store all matches.
- Update team statistics.
- Calculate team points.
- Rank teams.
- Display the results table.
- Display match details.

🛠️ Technologies Used
- Java
- Object-Oriented Programming (OOP)
- ArrayList
- IntelliJ IDEA
- Git
- GitHub

🧠 OOP Concepts Used
- Classes and Objects
- Encapsulation
- Composition
- ArrayList Collections
- Constructors
- Getters and Setters
- Methods

📊 Example Output
===== Soccer League Results =====
Team 1 - Goals: 2 - Points: 3
Team 4 - Goals: 2 - Points: 3
Team 5 - Goals: 1 - Points: 1
Team 6 - Goals: 1 - Points: 1
Team 2 - Goals: 1 - Points: 0
Team 3 - Goals: 0 - Points: 0

Team 1 vs Team 2
Player 1 - Minute: 20
Player 1 - Minute: 45
Player 3 - Minute: 70

▶️ How to Run
1. Open the project in IntelliJ IDEA.
2. Open Schedule.java.
3. Run the main() method.
4. The league results and match details will be displayed in the console.

🎯 Assignment
This project was developed as part of the:
DEPI – Software Testing Track
Part 01: Java Fundamentals
Session 04
Assignment #02 – Java OOP Assignment: Soccer League System

👨‍💻 Author
Ahmed Gaber