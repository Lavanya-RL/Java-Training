const shapes = [
    {
        'id': 0,
        'name': "Circle",
        'class': 'circle',
        'input': '2. Enter Radius',
        'side': ['RADIUS', 'r', 'cm'],
        'area': ['AREA', '&pi;r&#178;', 'sq cm'],
        'perimeter': ['PERIMETER', '2&pi;r', 'cm'],
        calculation: (value) => {
            localStorage.setItem('side', (value) + " " + shapes[0].side[2]);
            localStorage.setItem('area', (3.141 * value * value).toFixed(2) + " " + shapes[0].area[2]);
            localStorage.setItem('perimeter', (2 * 3.141 * value).toFixed(2) + " " + shapes[0].perimeter[2]);
        }
    },
    {
        'id': 1,
        'name': 'Equilateral Triangle',
        'class': 'triangle',
        'input': '2. Enter Side (Base & Height)',
        'side': ['SIDE', 's', 'cm'],
        'area': ['AREA', '0.433 * s * s', 'sq cm'],
        'perimeter': ['PERIMETER', '3 * s', 'cm'],
        calculation: (value) => {
            localStorage.setItem('side', (value) + " " + shapes[1].side[2]);
            localStorage.setItem('area', (0.433 * value * value).toFixed(2) + " " + shapes[1].area[2]);
            localStorage.setItem('perimeter', (3 * value) + " " + shapes[1].perimeter[2]);
        }
    },
    {
        'id': 2,
        'name': 'Square',
        'class': 'square',
        'input': '2. Enter Side',
        'side': ['SIDE', 's', 'cm'],
        'area': ['AREA', 's * s', 'sq cm'],
        'perimeter': ['PERIMETER', '4 * s', 'cm'],
        calculation: (value) => {
            localStorage.setItem('side', (value) + " " + shapes[2].side[2])
            localStorage.setItem('area', (value * value) + " " + shapes[2].area[2]);
            localStorage.setItem('perimeter', 4 * value + " " + shapes[2].perimeter[2]);
        }
    },
]

let selectedShape = ''
let selectedElement = ''
let shapeIndex;
const startSection = document.querySelector('.section-1')
const lastSection = document.querySelector('.section-3')
const midSection = document.querySelector(".section-2")
const shapeContainer = document.querySelector('#shapes')
const nextBtn = document.querySelector('.next')
const tick = document.querySelectorAll('.icon')

shapeContainer.addEventListener('click', (event) => {
    selectedShape = event.target.className
    
    for (let shape of shapes) {
        if (shape.class == selectedShape) shapeIndex = shape.id
    }
    selectedElement = document.querySelector('.' + shapes[shapeIndex].class)

 
    tick.forEach(element => element.style.display = 'none');
    tick[shapeIndex].style.display='block'
    nextBtn.style.display = 'block'
})


nextBtn.addEventListener('click', () => {
    document.querySelector('.section-1').style.display = 'none'

    
    let txt_div = document.createElement('div')
    txt_div.setAttribute('class', 'page2-top txt')
    txt_div.append(shapes[shapeIndex].input)
    midSection.append(txt_div)
    let input_box = document.createElement('input')
    input_box.setAttribute('class', 'page2-mid')
    input_box.setAttribute('type', 'number')
    midSection.append(input_box)
    let cal_btn = document.createElement('button')
    cal_btn.setAttribute('class', 'button')
    cal_btn.append('CALCULATE')
    cal_btn.style.display = 'block';
    midSection.append(cal_btn)
   cal_btn.addEventListener('click', () => {
        let input_value = input_box.value;
        if (!input_value) {
            alert('Enter a value!')
        }
        else {
            
            shapes[shapeIndex].calculation(input_value)
            midSection.innerHTML = '';
            let shape_show = document.createElement('div')
            shape_show.setAttribute('class', shapes[shapeIndex].class)
            lastSection.append(shape_show)
            let shape_name = document.createElement("div");
            shape_name.setAttribute('class', 'txt')
            shape_name.append(shapes[shapeIndex].name);
            lastSection.append(shape_name)
            let calculation_table = document.createElement('div');
            calculation_table.setAttribute('class', 'cal-table')
            for (let key of ['side', 'area', 'perimeter']) {
                for (let i = 0; i < 3; i++) {
                    let cell = document.createElement('div')
                    if (i == 2) cell.innerHTML = localStorage.getItem(key)
                    else cell.innerHTML = shapes[shapeIndex][key][i];
                    calculation_table.append(cell);
                }
            }
            
            lastSection.append(calculation_table)
          let startagain_btn = document.createElement('button');
            startagain_btn.setAttribute('class', 'button');
            startagain_btn.append('START AGAIN');
            startagain_btn.style.display = 'block';
            lastSection.append(startagain_btn)
            startagain_btn.addEventListener('click', () => {
                lastSection.innerHTML = '';
               localStorage.clear();
                document.querySelector('.section-1').style.display = 'flex';
                tick[shapeIndex].style.display='none' 
                nextBtn.style.display = 'none'
            })
        }
    })
})