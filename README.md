# Self-Ordering Application for Restaurant 🍕
### | Contributers: [Liviru-Nava](https://github.com/Liviru-Nava) & [MR.NHIP](https://github.com/8hirantha)

# Table of Contents 📂
- [Overview](https://github.com/Liviru-Nava/Self-Ordering-Application-for-Restaurant?tab=readme-ov-file#overview-of-the-project-)
- [Features of the project](https://github.com/Liviru-Nava/Self-Ordering-Application-for-Restaurant?tab=readme-ov-file#features-of-the-project-)
- [Implementation](https://github.com/Liviru-Nava/Self-Ordering-Application-for-Restaurant?tab=readme-ov-file#implementation-details-)

## Overview of the project 🔍
This is a Java Swing project which is related to a Self Ordering system available in restaurants which is implemented using data structures and graphs.
The customer can select the items he/she wishes to order. Once the order is placed, it will be received by the Kitchen in a First-In-First-Out method as the order that was placed first needs to be prepared first. 
The restaurant maintains a list of products each having their own category, namely Pizzas, Appetizers, Beverages and Desserts. The current order options are Dine-in and Delivery. Customers can view the list of products in any way to their liking, from the cheapest product to the most expensive and vice verse or even from the most popular products to the least or sort in alphabetical order. Any new product that was recently added to the menu will be displayed as a newly added product at the top of the list.

## Features of the project ⚙🧩
- **Inputs**
    - Insert and delete **Menu items** (Pizza, Appetizer, Desserts and Beverages).
    - Customer can select **Items** and place the **Order**. 
    - For the data structures to work, default data has been inserted inside, eg: Menu item details and distances between the Restaurant and customer location. 

- **Processes**
    - Calculate the total cost of the order. 
    - Search the maximum preparation time from all items in the order. Each item has its own preparation time and all the items in the order will be prepared within the maximum preparation time found in the order.  
    - If the user has selected "Delivery" order option, find the shortest path from the Restaurant to the Customer's location. 
    - Calculate and display the final time the order will be ready by for the customer.

- **Output**
    - Display the estimated preparation time to the user. 
    - Display how long it takes for the order to be delivered + estimated preparation time and finally display the estimated time of arrival. 
    - Display the list of Orders in the FIFO concept to the Kitchen. 
    - Provide the details of the order to the customer through an SMS using SMS API.

- **Data Structures and Algorithms**
    - **Doubly Linked List** : 
        - Used to provide an efficient manner to dynamically insert new pizzas, appetizers, desserts or beverages. 
        - Can traverse the list of products backwards allowing us to display the newly added menu items at the top.  

    - **Circular Queueu** :  
        - Circular Queues follow the FIFO (First-In-First-Out) property. 
        - This data structure is used to store the details of the Order because the order that the customer makes first is the order that needs to be prepared first. When the customer places an order, the order details get passed to the Kitchen in the first-in-first-out manner. 

    - **Merge Sort** : 
        - Merge sort is one of the most efficient sorting techniques. 
        - It follows a principle caled the Divide and Conquer property and has a less time complexity. 
        - The project makes use of merge sort algorithm at the time when the user wishes to sort the list of products based on the price, from minimum price and maximum price of the the product 

    - **Trees: Max-Heap** : 
        - The Max-Heap was implemented to store the preparation time of each item that was selected for the order.
        - The root node of the max heap will store the maximum preparation time from all items and return this value to display the estimated preparation to the customer. 

    - **Graph: Dijkstra's Algorithm** : 
        - This algorithm is used to find the shortest path. 
        - Our project requires to display the estimated delivery duration to the customer if the customer places a delivery order and that the order needs to travel from source (Restaurant) to destination (Customer location).

## Implementation details 🛠
- This is implemented using Java / Java Swing Components. 
- Product list is stored in a Doubly LinkedList. 
- Orders are maintained in a Circular Queue. 
- Sorting algorithm Merge sort is implemented. 
- Max preparation time is inserted and selected from a Max-heap. 
