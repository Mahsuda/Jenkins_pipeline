node {
    properties([parameters([choice(choices: ['us-east-1', 'us-east-2', 'us-west-1', 'us-west-2'], description: 'Please select a region', name: '')])])
    
    stage("Pull Repo"){
        echo "Hello"

    }

    stage("Build an image"){
        sh "packer version"

    }

    stage("Send notification to slack"){
        echo "Hello"

    }

    stage("Send email"){
        echo "Hello"

    }
}