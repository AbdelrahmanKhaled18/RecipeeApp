# RecipeeApp
RecipeeApp is an Android application built using Kotlin, designed to provide users with a comprehensive culinary experience. The app offers features such as user authentication, recipe browsing, favorite lists, and detailed recipe instructions with video links.

# Features
* User Authentication: Users can sign up for a new account or log in using an existing account, with data stored in a connected database.
* Popular Recipes: Upon logging in, users are presented with a list of popular recipes from various countries. Each recipe includes a title, country of origin, and a "Dish of the Day" that changes daily.
* Favorites List: Users can add their favorite recipes to a personalized list for easy access.
* Recipe Details: Each recipe comes with detailed instructions and a YouTube video link for better guidance.
  
# Technical Details
* Architecture: Utilizes the MVVM (Model-View-ViewModel) architecture for better code management and separation of concerns.
* Navigation: Implements Android's navigation component for smooth transitions between different sections of the app.
* Database: Integrated with a database to handle user data and favorites.
* API Integration: Fetches recipe data from an external API to keep the content fresh and dynamic.
* RecyclerView: Uses RecyclerView to display the list of recipes efficiently.
* Splash Page: Features a splash screen for an enhanced user experience at startup.
