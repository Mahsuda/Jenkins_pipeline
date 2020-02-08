node {
    stage("Pull repo"){
        git 'https://github.com/bkarakas/terraform-iaac-eks-burak'
    }
    stage("stage1"){
      sh "Terraform_version"
      sh "wget https://releases.hashicorp.com/terraform/0.12.20/terraform_0.12.20_linux_amd64.zip"
      sh "unzip terraform_0.12.20_linux_amd64.zip"
      sh  "./terraform version"
    }
    stage("stage1"){
        sh "source setenv.sh configuration/dev/us-west-2/dev.tfvars"
    }
    stage("stage1"){
        echo "Hello"
    }
}