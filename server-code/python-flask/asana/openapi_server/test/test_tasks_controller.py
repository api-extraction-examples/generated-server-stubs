import unittest

from flask import json

from openapi_server.models.add_dependencies_for_task_request import AddDependenciesForTaskRequest  # noqa: E501
from openapi_server.models.add_dependents_for_task_request import AddDependentsForTaskRequest  # noqa: E501
from openapi_server.models.add_followers_request import AddFollowersRequest  # noqa: E501
from openapi_server.models.add_project_for_task_request import AddProjectForTaskRequest  # noqa: E501
from openapi_server.models.add_tag_for_task_request import AddTagForTaskRequest  # noqa: E501
from openapi_server.models.create_task201_response import CreateTask201Response  # noqa: E501
from openapi_server.models.create_task_request import CreateTaskRequest  # noqa: E501
from openapi_server.models.delete_attachment200_response import DeleteAttachment200Response  # noqa: E501
from openapi_server.models.duplicate_task_request import DuplicateTaskRequest  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.get_job200_response import GetJob200Response  # noqa: E501
from openapi_server.models.get_tasks_for_project200_response import GetTasksForProject200Response  # noqa: E501
from openapi_server.models.remove_follower_for_task_request import RemoveFollowerForTaskRequest  # noqa: E501
from openapi_server.models.remove_project_for_task_request import RemoveProjectForTaskRequest  # noqa: E501
from openapi_server.models.remove_tag_for_task_request import RemoveTagForTaskRequest  # noqa: E501
from openapi_server.models.set_parent_for_task_request import SetParentForTaskRequest  # noqa: E501
from openapi_server.test import BaseTestCase


class TestTasksController(BaseTestCase):
    """TasksController integration test stubs"""

    def test_add_dependencies_for_task(self):
        """Test case for add_dependencies_for_task

        Set dependencies for a task
        """
        add_dependencies_for_task_request = openapi_server.AddDependenciesForTaskRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/tasks/{task_gid}/addDependencies'.format(task_gid='321654'),
            method='POST',
            headers=headers,
            data=json.dumps(add_dependencies_for_task_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_add_dependents_for_task(self):
        """Test case for add_dependents_for_task

        Set dependents for a task
        """
        add_dependents_for_task_request = openapi_server.AddDependentsForTaskRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/tasks/{task_gid}/addDependents'.format(task_gid='321654'),
            method='POST',
            headers=headers,
            data=json.dumps(add_dependents_for_task_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_add_followers_for_task(self):
        """Test case for add_followers_for_task

        Add followers to a task
        """
        add_followers_request = {"followers":"521621,621373"}
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/tasks/{task_gid}/addFollowers'.format(task_gid='321654'),
            method='POST',
            headers=headers,
            data=json.dumps(add_followers_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_add_project_for_task(self):
        """Test case for add_project_for_task

        Add a project to a task
        """
        add_project_for_task_request = openapi_server.AddProjectForTaskRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/tasks/{task_gid}/addProject'.format(task_gid='321654'),
            method='POST',
            headers=headers,
            data=json.dumps(add_project_for_task_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_add_tag_for_task(self):
        """Test case for add_tag_for_task

        Add a tag to a task
        """
        add_tag_for_task_request = openapi_server.AddTagForTaskRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/tasks/{task_gid}/addTag'.format(task_gid='321654'),
            method='POST',
            headers=headers,
            data=json.dumps(add_tag_for_task_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_subtask_for_task(self):
        """Test case for create_subtask_for_task

        Create a subtask
        """
        create_task_request = openapi_server.CreateTaskRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/tasks/{task_gid}/subtasks'.format(task_gid='321654'),
            method='POST',
            headers=headers,
            data=json.dumps(create_task_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_task(self):
        """Test case for create_task

        Create a task
        """
        create_task_request = openapi_server.CreateTaskRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/tasks',
            method='POST',
            headers=headers,
            data=json.dumps(create_task_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_task(self):
        """Test case for delete_task

        Delete a task
        """
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/tasks/{task_gid}'.format(task_gid='321654'),
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_duplicate_task(self):
        """Test case for duplicate_task

        Duplicate a task
        """
        duplicate_task_request = openapi_server.DuplicateTaskRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/tasks/{task_gid}/duplicate'.format(task_gid='321654'),
            method='POST',
            headers=headers,
            data=json.dumps(duplicate_task_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_dependencies_for_task(self):
        """Test case for get_dependencies_for_task

        Get dependencies from a task
        """
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]']),
                        ('limit', 50),
                        ('offset', 'eyJ0eXAiOJiKV1iQLCJhbGciOiJIUzI1NiJ9')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/tasks/{task_gid}/dependencies'.format(task_gid='321654'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_dependents_for_task(self):
        """Test case for get_dependents_for_task

        Get dependents from a task
        """
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]']),
                        ('limit', 50),
                        ('offset', 'eyJ0eXAiOJiKV1iQLCJhbGciOiJIUzI1NiJ9')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/tasks/{task_gid}/dependents'.format(task_gid='321654'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_subtasks_for_task(self):
        """Test case for get_subtasks_for_task

        Get subtasks from a task
        """
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]']),
                        ('limit', 50),
                        ('offset', 'eyJ0eXAiOJiKV1iQLCJhbGciOiJIUzI1NiJ9')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/tasks/{task_gid}/subtasks'.format(task_gid='321654'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_task(self):
        """Test case for get_task

        Get a task
        """
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/tasks/{task_gid}'.format(task_gid='321654'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_tasks(self):
        """Test case for get_tasks

        Get multiple tasks
        """
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]']),
                        ('limit', 50),
                        ('offset', 'eyJ0eXAiOJiKV1iQLCJhbGciOiJIUzI1NiJ9'),
                        ('assignee', '14641'),
                        ('project', '321654'),
                        ('section', '321654'),
                        ('workspace', '321654'),
                        ('completed_since', '2012-02-22T02:06:58.158Z'),
                        ('modified_since', '2012-02-22T02:06:58.158Z')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/tasks',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_tasks_for_project(self):
        """Test case for get_tasks_for_project

        Get tasks from a project
        """
        query_string = [('completed_since', '2012-02-22T02:06:58.158Z'),
                        ('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]']),
                        ('limit', 50),
                        ('offset', 'eyJ0eXAiOJiKV1iQLCJhbGciOiJIUzI1NiJ9')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/projects/{project_gid}/tasks'.format(project_gid='1331'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_tasks_for_section(self):
        """Test case for get_tasks_for_section

        Get tasks from a section
        """
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]']),
                        ('limit', 50),
                        ('offset', 'eyJ0eXAiOJiKV1iQLCJhbGciOiJIUzI1NiJ9')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/sections/{section_gid}/tasks'.format(section_gid='321654'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_tasks_for_tag(self):
        """Test case for get_tasks_for_tag

        Get tasks from a tag
        """
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]']),
                        ('limit', 50),
                        ('offset', 'eyJ0eXAiOJiKV1iQLCJhbGciOiJIUzI1NiJ9')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/tags/{tag_gid}/tasks'.format(tag_gid='11235'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_tasks_for_user_task_list(self):
        """Test case for get_tasks_for_user_task_list

        Get tasks from a user task list
        """
        query_string = [('completed_since', '2012-02-22T02:06:58.158Z'),
                        ('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]']),
                        ('limit', 50),
                        ('offset', 'eyJ0eXAiOJiKV1iQLCJhbGciOiJIUzI1NiJ9')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/user_task_lists/{user_task_list_gid}/tasks'.format(user_task_list_gid='12345'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_remove_dependencies_for_task(self):
        """Test case for remove_dependencies_for_task

        Unlink dependencies from a task
        """
        add_dependencies_for_task_request = openapi_server.AddDependenciesForTaskRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/tasks/{task_gid}/removeDependencies'.format(task_gid='321654'),
            method='POST',
            headers=headers,
            data=json.dumps(add_dependencies_for_task_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_remove_dependents_for_task(self):
        """Test case for remove_dependents_for_task

        Unlink dependents from a task
        """
        add_dependents_for_task_request = openapi_server.AddDependentsForTaskRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/tasks/{task_gid}/removeDependents'.format(task_gid='321654'),
            method='POST',
            headers=headers,
            data=json.dumps(add_dependents_for_task_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_remove_follower_for_task(self):
        """Test case for remove_follower_for_task

        Remove followers from a task
        """
        remove_follower_for_task_request = openapi_server.RemoveFollowerForTaskRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/tasks/{task_gid}/removeFollowers'.format(task_gid='321654'),
            method='POST',
            headers=headers,
            data=json.dumps(remove_follower_for_task_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_remove_project_for_task(self):
        """Test case for remove_project_for_task

        Remove a project from a task
        """
        remove_project_for_task_request = openapi_server.RemoveProjectForTaskRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/tasks/{task_gid}/removeProject'.format(task_gid='321654'),
            method='POST',
            headers=headers,
            data=json.dumps(remove_project_for_task_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_remove_tag_for_task(self):
        """Test case for remove_tag_for_task

        Remove a tag from a task
        """
        remove_tag_for_task_request = openapi_server.RemoveTagForTaskRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/tasks/{task_gid}/removeTag'.format(task_gid='321654'),
            method='POST',
            headers=headers,
            data=json.dumps(remove_tag_for_task_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_search_tasks_for_workspace(self):
        """Test case for search_tasks_for_workspace

        Search tasks in a workspace
        """
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]']),
                        ('text', 'Bug'),
                        ('resource_subtype', 'milestone'),
                        ('assignee.any', '12345,23456,34567'),
                        ('assignee.not', '12345,23456,34567'),
                        ('portfolios.any', '12345,23456,34567'),
                        ('projects.any', '12345,23456,34567'),
                        ('projects.not', '12345,23456,34567'),
                        ('projects.all', '12345,23456,34567'),
                        ('sections.any', '12345,23456,34567'),
                        ('sections.not', '12345,23456,34567'),
                        ('sections.all', '12345,23456,34567'),
                        ('tags.any', '12345,23456,34567'),
                        ('tags.not', '12345,23456,34567'),
                        ('tags.all', '12345,23456,34567'),
                        ('teams.any', '12345,23456,34567'),
                        ('followers.not', '12345,23456,34567'),
                        ('created_by.any', '12345,23456,34567'),
                        ('created_by.not', '12345,23456,34567'),
                        ('assigned_by.any', '12345,23456,34567'),
                        ('assigned_by.not', '12345,23456,34567'),
                        ('liked_by.not', '12345,23456,34567'),
                        ('commented_on_by.not', '12345,23456,34567'),
                        ('due_on.before', '2019-09-15'),
                        ('due_on.after', '2019-09-15'),
                        ('due_on', '2019-09-15'),
                        ('due_at.before', '2019-04-15T01:01:46.055Z'),
                        ('due_at.after', '2019-04-15T01:01:46.055Z'),
                        ('start_on.before', '2019-09-15'),
                        ('start_on.after', '2019-09-15'),
                        ('start_on', '2019-09-15'),
                        ('created_on.before', '2019-09-15'),
                        ('created_on.after', '2019-09-15'),
                        ('created_on', '2019-09-15'),
                        ('created_at.before', '2019-04-15T01:01:46.055Z'),
                        ('created_at.after', '2019-04-15T01:01:46.055Z'),
                        ('completed_on.before', '2019-09-15'),
                        ('completed_on.after', '2019-09-15'),
                        ('completed_on', '2019-09-15'),
                        ('completed_at.before', '2019-04-15T01:01:46.055Z'),
                        ('completed_at.after', '2019-04-15T01:01:46.055Z'),
                        ('modified_on.before', '2019-09-15'),
                        ('modified_on.after', '2019-09-15'),
                        ('modified_on', '2019-09-15'),
                        ('modified_at.before', '2019-04-15T01:01:46.055Z'),
                        ('modified_at.after', '2019-04-15T01:01:46.055Z'),
                        ('is_blocking', false),
                        ('is_blocked', false),
                        ('has_attachment', false),
                        ('completed', false),
                        ('is_subtask', false),
                        ('sort_by', 'modified_at'),
                        ('sort_ascending', False)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/workspaces/{workspace_gid}/tasks/search'.format(workspace_gid='12345'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_set_parent_for_task(self):
        """Test case for set_parent_for_task

        Set the parent of a task
        """
        set_parent_for_task_request = openapi_server.SetParentForTaskRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/tasks/{task_gid}/setParent'.format(task_gid='321654'),
            method='POST',
            headers=headers,
            data=json.dumps(set_parent_for_task_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_task(self):
        """Test case for update_task

        Update a task
        """
        create_task_request = openapi_server.CreateTaskRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/tasks/{task_gid}'.format(task_gid='321654'),
            method='PUT',
            headers=headers,
            data=json.dumps(create_task_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
