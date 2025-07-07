import subprocess
import os
import sys 

def is_git_repo():
    return subprocess.run("git rev-parse --is-inside-work-tree", cwd=os.path.dirname(__file__), shell=True, capture_output=True).returncode == 0

def run_command(command):
    """Run a shell command and print output/errors"""
    try:
        result = subprocess.run(command, check=True, shell=True, text=True, capture_output=True)
        print(result.stdout)
    except subprocess.CalledProcessError as e:
        print(f"Error: {e.stderr.strip()}")

def git_add_commit_push(commit_message):
    if not is_git_repo():
        print("Error: Not a Git repository. Please run this script inside a Git project.")
        sys.exit(1)

    print("Running: git add .")
    run_command("git add .")

    print(f"Running: git commit -m \"{commit_message}\"")
    run_command(f'git commit -m "{commit_message}"')

    print("Running: git push")
    run_command("git push")

# Set your commit message here
commit_message = "Added Python scripts to Git"
git_add_commit_push(commit_message)
