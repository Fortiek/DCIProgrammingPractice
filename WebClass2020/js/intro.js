myFunction(){
    var pictureUp = document.getElementById("uberDemo");

    if(pictureUp.getAttribute('src') == "")
    {
        pictureUp.setAttribute('src')='../img/bulbon.png';
    }
    else if(pictureUp.getAttribute('src') == "../img/bulbon.png")
    {
        pictureUp.setAttribute('src')='../img/bulboff.png';
    }
    else
    {
        pictureUp.setAttribute('src')='../img/bulbon.png';
    }
}