function toggleFields(option) 
{
    var updateFields = document.getElementById("updateFields");
    
    if (option === "yes") 
    {
        updateFields.style.display = "block";
    } 
    else 
    {
        updateFields.style.display = "none";
    }
}
function initializePage() 
{
    document.getElementById("updateOption").value = "";
    document.getElementById("updateFields").style.display = "none";
}
window.onload = initializePage;