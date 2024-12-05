
<body>

<h1>📅 EventManagerAPI</h1>
<p>A Spring Boot-based backend application for managing events. This system allows users to create, update, retrieve, and delete events with attributes such as name, date, location, and organizer.</p>

<h2>📋 Features</h2>
<ul>
  <li>Create new events</li>
  <li>View all events</li>
  <li>View details of a specific event</li>
  <li>Update existing events</li>
  <li>Delete events</li>
</ul>

<h2>🛠️ Setup Instructions</h2>

<h3>Prerequisites</h3>
<ul>
  <li>Java 17 or higher</li>
  <li>IntelliJ IDEA or any preferred Java IDE</li>
  <li>Postman or any API testing tool</li>
</ul>

<h3>Steps to Run</h3>
<ol>
  <li>Clone the repository:
    <pre><code>git clone https://github.com/chisa-sifiso
      /EventManagerAPI.git</code></pre>
  </li>
  <li>Open the project in IntelliJ IDEA.</li>
  <li>Ensure the necessary dependencies are installed (Spring Web, Spring Data JPA, H2 Database).</li>
  <li>Run the application from the main class.</li>
  <li>Access the API at <code>http://localhost:8080/api/events</code>.</li>
</ol>

<h2>📚 API Endpoints</h2>

<h3>Get All Events</h3>
<pre><code>GET /api/events</code></pre>
<p>Retrieve a list of all events.</p>

<h3>Get Event by ID</h3>
<pre><code>GET /api/events/{id}</code></pre>
<p>Retrieve a specific event by its ID.</p>

<h3>Add a New Event</h3>
<pre><code>POST /api/events</code></pre>
<p>Add a new event with a JSON body.</p>
<p><strong>Example JSON Body:</strong></p>
<pre><code>{
  "name": "Tech Conference",
  "date": "2024-01-15",
  "location": "Cape Town",
  "organizer": "Tech Corp"
}</code></pre>

<h3>Update an Existing Event</h3>
<pre><code>PUT /api/events/{id}</code></pre>
<p>Update an event's details by ID.</p>
<p><strong>Example JSON Body:</strong></p>
<pre><code>{
  "name": "Updated Tech Conference",
  "date": "2024-01-20",
  "location": "Johannesburg",
  "organizer": "Tech Innovators"
}</code></pre>

<h3>Delete an Event</h3>
<pre><code>DELETE /api/events/{id}</code></pre>
<p>Delete an event by its ID.</p>

<h2>📂 Project Structure</h2>
<ul>
  <li><code>model/</code>: Contains the entity classes</li>
  <li><code>repository/</code>: Contains the JPA repository interfaces</li>
  <li><code>service/</code>: Contains the service layer for business logic</li>
  <li><code>controller/</code>: Contains the REST controller classes</li>
</ul>

<h2>🔗 H2 Database Console</h2>
<p>The application uses an in-memory H2 database. You can access the H2 database console at <code>http://localhost:8080/h2-console</code> to view the data.</p>
<p><strong>Database Credentials:</strong></p>
<ul>
  <li><strong>JDBC URL:</strong> <code>jdbc:h2:mem:eventdb</code></li>
  <li><strong>Username:</strong> <code>sa</code></li>
  <li><strong>Password:</strong> <code>password</code></li>
</ul>

<h2>🤝 Contributing</h2>
<p>Feel free to fork this repository and submit pull requests for new features or improvements.</p>

<h2>📄 License</h2>
<p>This project is licensed under the MIT License.</p>


</body>
</html>
