const posterArray=[
    {
        "imageUrl" : "https://ddz4ak4pa3d19.cloudfront.net/cache/56/62/5662bc2079ee7ffd491b65c29a360ac9.jpg",
        "title" : "Sprite Fright"
    },
    {
        "imageUrl" : "https://cdna.artstation.com/p/assets/covers/images/019/392/064/large/andy-goralczyk-agent-poster-street-small.jpg?1563288236",
        "title" : "Agent 327"
    },
    {
        "imageUrl" : "https://upload.wikimedia.org/wikipedia/commons/thumb/2/25/Spring2019AlphaPosterBlender.jpg/1200px-Spring2019AlphaPosterBlender.jpg",
        "title" : "Spring"
    }
]
Data={
    "videoUrl" : "https://ia800200.us.archive.org/7/items/Sintel/sintel-2048-stereo.mp4",
    "title" : "Sintel",
    "description" : "“Sintel” is an independently produced short film, initiated by the Blender Foundation as a means to further improve and validate the free/open source 3D creation suite Blender. With initial funding provided by 1000s of donations via the internet community, it has again proven to be a viable development model for both open 3D technology as for independent animation film. This 15 minute film has been realized in the studio of the Amsterdam Blender Institute, by an international team of artists and developers. ",
    "comments" : [
        {
            "name" : "Micheal Scott",
            "image": "images/reviewers/micheal.png",
            "comment" : "How often do people make a film where the main character kills the thing they were trying to rescue because they didn’t recognize it? Not that often. This brought tears to my eyes."
        },
        {
            "name" : "Dwight K Schrute (Asst. to the Regional Manager)",
            "image": "images/reviewers/dwight.png",
            "comment" : "Breathtaking, I’ve only just begun my blender journey. Making something every day until I get to the point I can create something on this scale. Pretty amazing short story as well. Props all around to all involved in this great piece of work!"
        },
        {
            "name" : "Jim Halpert",
            "image" : "images/reviewers/jim.png",
            "comment" : "Only the best stories can make you cry, and while I’ve lost count how many times I’ve watched this remarkable piece of art  over the years showing it to people I know, Sintel brings a tear to my eye every time. This film is inspiring not only for the beautiful story but for the magical quality animation."
        },
        {
            "name" : "Pam Beesly Halpert",
            "image" : "images/reviewers/pam.png",
            "comment" : "This short film was riveting. The musical overlay was astounding and so were the animations. I was bawling like a little kid at the end of this video and not many videos are able to do this to me."
        },
        {
            "name" : "Angela Martin",
            "image" : "images/reviewers/angela.png",
            "comment" : "I saw this movie a long time ago as a child and it still scars me to this day. This is the kind of stuff that should AT THE VERY LEAST be played before a movie the way they showed bao before The Incredibles 2. These are little masterpieces."
        },
        {
            "name" : "Kevin Malone",
            "image" : "images/reviewers/kevin.png",
            "comment" : "Wow, at first I thought that it wasn’t that good, nice animation and all but not excellent story. Then I saw the end. The feels are real. You win Blender Foundation, you win."
        },
        {
            "name" : "Andy Bernard",
            "image": "images/reviewers/andy.png",
            "comment": "Honestly seeing a story with a sad ending is refreshing, I can tell you the ending of 99% of all movies ever made. “Its a happy ending”. Its why I like game of thrones and its why I loved this."
        }
    ]
};
// console(Data.videoUrl);
const video_prt=document.querySelector("#video-part");
const video=document.createElement("video");
// const source=document.createElement("source")
video.setAttribute('poster','poster.jpeg');
video.setAttribute('src',Data.videoUrl);
video.setAttribute('type','video/mp4');
video.setAttribute('controls','true');
video_prt.append(video);
const h1=document.createElement("h1");
const txt=Data.title;
h1.append(txt);
video_prt.append(h1);
const para=document.createElement("p");
para.append(Data.description);
video_prt.append(para);
const hr=document.createElement("hr");
video_prt.append(hr);
const comment_prt=document.querySelector(".comment-part");
for(let i=0;i<7;i++){
const comments=document.createElement("div");
comments.setAttribute('id','comments');
const comments_img=document.createElement("div");
comments_img.setAttribute('class','comments-img');
const image=document.createElement("img");
image.setAttribute('src',Data.comments[i].image);
comments_img.append(image);
comments.append(comments_img);
const comments_info=document.createElement("div");
 comments_info.setAttribute('class','comments-info');
 const h4=document.createElement("h4");
 h4.append(Data.comments[i].name);
 comments_info.append(h4);
 const h5=document.createElement("h5");
 h5.append(Data.comments[i].comment);
 comments_info.append(h5);
 comments.append(comments_info);
comment_prt.append(comments)
}

const poster_prt=document.querySelector(".poster-part");
const h3=document.createElement("h3");
h3.append("Upcoming Projects");
poster_prt.append(h3);
const poster_img=document.createElement("div");
poster_img.setAttribute('id','poster-img');
for(let j=0;j<3;j++){
const img_post=document.createElement("img");
img_post.setAttribute('src',posterArray[j].imageUrl);
img_post.setAttribute('alt',posterArray[j].title);
poster_img.append(img_post);
poster_prt.append(poster_img);
}
