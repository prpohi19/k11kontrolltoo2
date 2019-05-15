/*jshint esversion:6*/
class Ained{
  constructor(aine, teema, kuup2ev){
    this.aine = aine;
    this.teema = teema;
    this.kuup2ev = kuup2ev;
  }
}

let ained = [];
$('#saveload').on('click', save);
$('#load').on('click', loadFromFile);
$('#sort').on('click', function(){
  console.log(ained);
  ained.sort(sortFunction);
    render();
});


function render(){
  $('#ainediv').html("");
  var today = new Date();
  today.setHours(0,0,0,0);
  ained.forEach(function(aine, aineIndex){
    var checkdate = new Date(aine.kuup2ev);
    let className = '';
    $('#ainediv').append('<ul id="' + aineIndex + '" style="border:1px solid #000000;" '
     + className + ' ><li>'+"Aine nimetus: "+ aine.aine+'</li><li>'+"Tunni teema: "+ aine.teema+'</li><li>'
     +"kuupäev: "+aine.kuup2ev+'</li></ul>');
  });
  console.log(today);

}


function loadFromFile() {
  ained = [];
    let content = JSON.parse(data).content;
    content.forEach(function(aine, aineIndex){
      ained.push(new Ained(aine.aine, aine.teema, aine.kuup2ev));
      render();
    });
}

function save(){
  const titleValue = $('#aine').val();
  const dateValue = $('#kuup2ev').val();
  const descriptionValue = $('#teema').val();
  ained.push(new Ained(titleValue, descriptionValue, dateValue));
    ained2 = {};
    for(let i = 0; i < ained.length; i++) {
      
      if (!ained2[ained[i].aine]) {
        ained2[ained[i].aine] = [];
      }
      ained2[ained[i].aine].push(aine);
    }
    for(const [ key, value ] of Object.entries(ained2)) {
      $('#ained2div').append('<p> '+"Ainet nimega: "+key+" on kokku "+value.length+' ainet'+'</p>');
    }
    console.log(ained2);
  
  
  console.log(ained);
  render();

}
function sortFunction(a,b) {
  var dateA = new Date(a.kuup2ev).getTime();
  var dateB = new Date(b.kuup2ev).getTime();
  return dateA - dateB;
}

