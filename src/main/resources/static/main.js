const fetchQuotes = () => {
    fetch(`/api/get_user_quotes?name=${USERNAME}`)
        .then(res => res.json())
        .then(res => buildQuotes(res))
}

const fetchGeekApiJoke = () => {
    fetch("/api/get_funny_geek_joke")
        .then(res => res.json())
        .then(res => buildFunnyJoke(res))
}

const buildQuotes = (res) => {
    const jokesSection = document.getElementsByClassName("jokesSectionClass")[0]
    jokesSection.innerText = ""

    res.forEach(el => {
        const sectionTag = document.createElement('section')
        const pTag = document.createElement('p')

        pTag.innerText = el.quote
        sectionTag.appendChild(pTag)
        jokesSection.appendChild(sectionTag)
    })
}

const buildFunnyJoke = (res) => {
    const sectionTag = document.createElement('section')
    const pTag = document.createElement('p')
    pTag.setAttribute('class', 'displayJokeClass')

    const jokesSection = document.getElementsByClassName("jokesSectionClass")[0]
    jokesSection.innerText = ""

    pTag.innerText = res.joke
    sectionTag.appendChild(pTag)
    jokesSection.appendChild(sectionTag)
}

const addJoke = (quote) => {
    const data = {
        quote: quote,
        name: USERNAME
    }

    fetch("/api/add_quote", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(data)
    })
    .catch(err => console.log("Error: ", err))
}

const signIn = () => {
    const userName = document.getElementsByClassName("userNameInputClass")[0]
    window.location.href = `/jokes?name=${userName.value}`
}
