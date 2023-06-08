import axios from "axios";

function App() {
  const getCookie = async () => {
    try {
      const response = await axios.get("http://localhost:8080/api/set-cookie", {
        withCredentials: true,
      });
      console.log(response.data);
    } catch (error) {
      console.error("There was an error!", error);
    }
  };

  return (
    <div className="App">
      <button onClick={getCookie}>Get Cookie</button>
    </div>
  );
}

export default App;
