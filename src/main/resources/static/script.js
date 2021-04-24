function readURL(input) {
    if (input.files && input.files[0]) {
        var reader = new FileReader();

        reader.onload = function (e) {
            $('#blah')
                .attr('src', e.target.result)
                .width(500)
        };

        reader.readAsDataURL(input.files[0]);
        userAction()
  
    }
}
const userAction = async () => {
    const response = await fetch('http://localhost:8080/test', {
      method: 'POST',
      body: "{thanh: 2}", // string or object
      headers: {
        'Content-Type': 'application/json'
      }
    });
    const myJson = await response.json(); //extract JSON from the http response
    // do something with myJson
  }