def buildApp() {
    echo "Building the application..."
}

def testApp() {
    echo "Testing the application..."
}

def deployApp() {
    echo "배포하는 중~~~"
    echo "${params.VERSION}"
}

return this 