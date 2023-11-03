let map;
let heatmap;

function initMap() {
    map = new google.maps.Map(document.getElementById('map'), {
        center: { lat: 0, lng: 0 }, // Default center, you'll set this based on the user's geolocation
        zoom: 10 // Adjust the zoom level as needed
    });

    // Fetch survey data from your server (you need to implement this)
    // and format it as an array of LatLng objects
    const surveyData = [
        new google.maps.LatLng(37.7749, -122.4194), // Example data point
        // Add more survey data points here
    ];

    heatmap = new google.maps.visualization.HeatmapLayer({
        data: surveyData,
        radius: 50, // Adjust the heatmap radius as needed
    });

    heatmap.setMap(map);
}
