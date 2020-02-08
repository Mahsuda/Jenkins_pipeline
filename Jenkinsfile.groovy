node {
    properties([parameters([choice(choices: ['us-east-1', 'us-east-2', 'us-west-1', 'us-west-2'], description: 'Please select a region', name: '')])])
    
    stage("Pull Repo"){
        git 'https://github.com/Mahsuda/packer.git'

    }

    stage("Build an image"){
        sh "packer version"
        sh "packer build -var region=${AMI_REGION} tools/jenkins_example.json"

    }

    stage("Send notification to slack"){
        echo "Hello"

    }

    stage("Send email"){
        echo "Hello"

    }
}