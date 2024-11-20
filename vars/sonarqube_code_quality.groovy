def call() {
    timeout(time: 5, unit: "MINUTES") {
        def qualityGate = waitForQualityGate abortPipeline: false
        echo "SonarQube Quality Gate status: ${qualityGate.status}"
    }
}
