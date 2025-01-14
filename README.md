# Android GridView Project

This project demonstrates the use of a GridView in Android with Java. The GridView displays a set of items (images and text) in a scrollable grid format. Each item in the grid can be clicked to display a Toast message with the item’s name and navigate to a new activity with additional details.

## Features

- **Custom Grid Layout**: A grid with image and text elements customized for each item.
- **Click Events**: Clicking on any grid item displays a Toast message with the item’s name and navigates to a new activity displaying more details.
- **Data Passing**: Passes data (image and text) from one activity to another using `Intent` extras.

## Code Overview

### `MainActivity.java`

The main activity of the app initializes and manages the GridView. Key components include:

- **GridView Setup**: Initializes the `GridView` and sets a custom adapter.
- **Data Arrays**:
  - `gridelements[]`: An array of image resource IDs for each grid item.
  - `gridtexts[]`: A corresponding array of text labels for each grid item.
- **Custom Adapter**:
  - `CustomAdapter` (an inner class) extends `BaseAdapter` to bind data (images and text) to each grid item.
  - Overrides `getView()` to customize the layout of each item in the grid.
- **Click Handling**:
  - `setOnItemClickListener()`: Sets up a click listener for each grid item, showing a Toast with the item’s label.
  - Navigates to `MainActivity2` while passing selected image and text data.

### Example Code Snippet

Below is a sample from the `MainActivity.java` file that demonstrates the `onItemClick` event handling for grid items:

```java
gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(MainActivity.this, "Grid position =" + position, Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("imagesent", gridelements[position]);
        intent.putExtra("textsent", gridtexts[position]);
        startActivity(intent);
    }
});
