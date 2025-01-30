
# CardGame

CardGame is a simple card game that simulates a match between 4 players. Each player is dealt a number of cards from the deck, and then the game proceeds with each player playing a card to determine the winner of each round.

## Technologies Used

- **Java 17**: The Java version used to develop the game.
- **Collections (ArrayList)**: For managing players and cards.
- **Junit 5**: For unit tests.
- **Maven**: For building and managing dependencies.
- **IntelliJ IDEA**: The IDE used to develop the project.
- **Git**: For version control.

## How the Game Works

1. **Initialization**:
   - A deck of cards is created and shuffled.
   - 4 players are created (Player1, Player2, Player3, Player4).

2. **Card Distribution**:
   - Each player is dealt one card from the deck until all cards are distributed.

3. **Playing Rounds**:
   - Each player plays a card in turn.
   - The played card is compared with others to determine the round winner. The card with the highest value wins the round.

4. **Displaying the Winner**:
   - At the end of each round, the winner's name is printed to the console.

## Project Structure

The project is composed of several classes:
- **CardGame**: Manages the game logic, including card distribution and round winner determination.
- **Player**: Represents a player who can receive and play cards.
- **Card**: Represents a single card, with a value and a suit.
- **Deck**: Represents the deck of cards, with methods for shuffling and dealing cards.

## How to Run the Application

1. **Build the Project**:
   Ensure that Maven is installed and configured on your system. Then run the following command to build the project:

   ```bash
   mvn clean install
   ```

2. **Run the Game**:
   Once built, you can run the game using the following command:

   ```bash
   mvn exec:java -Dexec.mainClass="com.danozzo.Main"
   ```

   This will start the game and print the result of each round to the console.

## Future Features

- **Score Persistence**: Add a feature to keep track of players' scores.
- **Online Multiplayer Mode**: Allow playing with other players via the network.
- **Graphical User Interface**: Add a GUI to visualize the game in a more interactive way.

## Contributing

If you'd like to contribute to this project, you can:
1. Fork the repository.
2. Create a new branch for your changes.
3. Submit a pull request with your changes.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
```