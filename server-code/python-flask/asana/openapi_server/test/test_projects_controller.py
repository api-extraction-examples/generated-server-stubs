import unittest

from flask import json

from openapi_server.models.add_custom_field_setting_for_portfolio200_response import AddCustomFieldSettingForPortfolio200Response  # noqa: E501
from openapi_server.models.add_custom_field_setting_for_portfolio_request import AddCustomFieldSettingForPortfolioRequest  # noqa: E501
from openapi_server.models.add_followers_for_project_request import AddFollowersForProjectRequest  # noqa: E501
from openapi_server.models.add_members_for_portfolio_request import AddMembersForPortfolioRequest  # noqa: E501
from openapi_server.models.create_project201_response import CreateProject201Response  # noqa: E501
from openapi_server.models.create_project_request import CreateProjectRequest  # noqa: E501
from openapi_server.models.delete_attachment200_response import DeleteAttachment200Response  # noqa: E501
from openapi_server.models.duplicate_project_request import DuplicateProjectRequest  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.get_items_for_portfolio200_response import GetItemsForPortfolio200Response  # noqa: E501
from openapi_server.models.get_job200_response import GetJob200Response  # noqa: E501
from openapi_server.models.get_task_counts_for_project200_response import GetTaskCountsForProject200Response  # noqa: E501
from openapi_server.models.project_save_as_template_request import ProjectSaveAsTemplateRequest  # noqa: E501
from openapi_server.models.remove_custom_field_setting_for_portfolio_request import RemoveCustomFieldSettingForPortfolioRequest  # noqa: E501
from openapi_server.models.remove_followers_for_project_request import RemoveFollowersForProjectRequest  # noqa: E501
from openapi_server.models.remove_members_for_portfolio_request import RemoveMembersForPortfolioRequest  # noqa: E501
from openapi_server.test import BaseTestCase


class TestProjectsController(BaseTestCase):
    """ProjectsController integration test stubs"""

    def test_add_custom_field_setting_for_project(self):
        """Test case for add_custom_field_setting_for_project

        Add a custom field to a project
        """
        add_custom_field_setting_for_portfolio_request = openapi_server.AddCustomFieldSettingForPortfolioRequest()
        query_string = [('opt_pretty', true)]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/projects/{project_gid}/addCustomFieldSetting'.format(project_gid='1331'),
            method='POST',
            headers=headers,
            data=json.dumps(add_custom_field_setting_for_portfolio_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_add_followers_for_project(self):
        """Test case for add_followers_for_project

        Add followers to a project
        """
        add_followers_for_project_request = openapi_server.AddFollowersForProjectRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/projects/{project_gid}/addFollowers'.format(project_gid='1331'),
            method='POST',
            headers=headers,
            data=json.dumps(add_followers_for_project_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_add_members_for_project(self):
        """Test case for add_members_for_project

        Add users to a project
        """
        add_members_for_portfolio_request = openapi_server.AddMembersForPortfolioRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/projects/{project_gid}/addMembers'.format(project_gid='1331'),
            method='POST',
            headers=headers,
            data=json.dumps(add_members_for_portfolio_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_project(self):
        """Test case for create_project

        Create a project
        """
        create_project_request = openapi_server.CreateProjectRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/projects',
            method='POST',
            headers=headers,
            data=json.dumps(create_project_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_project_for_team(self):
        """Test case for create_project_for_team

        Create a project in a team
        """
        create_project_request = openapi_server.CreateProjectRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/teams/{team_gid}/projects'.format(team_gid='159874'),
            method='POST',
            headers=headers,
            data=json.dumps(create_project_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_project_for_workspace(self):
        """Test case for create_project_for_workspace

        Create a project in a workspace
        """
        create_project_request = openapi_server.CreateProjectRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/workspaces/{workspace_gid}/projects'.format(workspace_gid='12345'),
            method='POST',
            headers=headers,
            data=json.dumps(create_project_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_project(self):
        """Test case for delete_project

        Delete a project
        """
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/projects/{project_gid}'.format(project_gid='1331'),
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_duplicate_project(self):
        """Test case for duplicate_project

        Duplicate a project
        """
        duplicate_project_request = openapi_server.DuplicateProjectRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/projects/{project_gid}/duplicate'.format(project_gid='1331'),
            method='POST',
            headers=headers,
            data=json.dumps(duplicate_project_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_project(self):
        """Test case for get_project

        Get a project
        """
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/projects/{project_gid}'.format(project_gid='1331'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_projects(self):
        """Test case for get_projects

        Get multiple projects
        """
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]']),
                        ('limit', 50),
                        ('offset', 'eyJ0eXAiOJiKV1iQLCJhbGciOiJIUzI1NiJ9'),
                        ('workspace', '1331'),
                        ('team', '14916'),
                        ('archived', false)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/projects',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_projects_for_task(self):
        """Test case for get_projects_for_task

        Get projects a task is in
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
            '/api/1.0/tasks/{task_gid}/projects'.format(task_gid='321654'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_projects_for_team(self):
        """Test case for get_projects_for_team

        Get a team's projects
        """
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]']),
                        ('limit', 50),
                        ('offset', 'eyJ0eXAiOJiKV1iQLCJhbGciOiJIUzI1NiJ9'),
                        ('archived', false)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/teams/{team_gid}/projects'.format(team_gid='159874'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_projects_for_workspace(self):
        """Test case for get_projects_for_workspace

        Get all projects in a workspace
        """
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]']),
                        ('limit', 50),
                        ('offset', 'eyJ0eXAiOJiKV1iQLCJhbGciOiJIUzI1NiJ9'),
                        ('archived', false)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/workspaces/{workspace_gid}/projects'.format(workspace_gid='12345'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_task_counts_for_project(self):
        """Test case for get_task_counts_for_project

        Get task count of a project
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
            '/api/1.0/projects/{project_gid}/task_counts'.format(project_gid='1331'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_project_save_as_template(self):
        """Test case for project_save_as_template

        Create a project template from a project
        """
        project_save_as_template_request = {"workspace":"12345","public":True,"name":"New Project Template","team":"12345"}
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/projects/{project_gid}/saveAsTemplate'.format(project_gid='1331'),
            method='POST',
            headers=headers,
            data=json.dumps(project_save_as_template_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_remove_custom_field_setting_for_project(self):
        """Test case for remove_custom_field_setting_for_project

        Remove a custom field from a project
        """
        remove_custom_field_setting_for_portfolio_request = openapi_server.RemoveCustomFieldSettingForPortfolioRequest()
        query_string = [('opt_pretty', true)]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/projects/{project_gid}/removeCustomFieldSetting'.format(project_gid='1331'),
            method='POST',
            headers=headers,
            data=json.dumps(remove_custom_field_setting_for_portfolio_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_remove_followers_for_project(self):
        """Test case for remove_followers_for_project

        Remove followers from a project
        """
        remove_followers_for_project_request = openapi_server.RemoveFollowersForProjectRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/projects/{project_gid}/removeFollowers'.format(project_gid='1331'),
            method='POST',
            headers=headers,
            data=json.dumps(remove_followers_for_project_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_remove_members_for_project(self):
        """Test case for remove_members_for_project

        Remove users from a project
        """
        remove_members_for_portfolio_request = openapi_server.RemoveMembersForPortfolioRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/projects/{project_gid}/removeMembers'.format(project_gid='1331'),
            method='POST',
            headers=headers,
            data=json.dumps(remove_members_for_portfolio_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_project(self):
        """Test case for update_project

        Update a project
        """
        create_project_request = openapi_server.CreateProjectRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/projects/{project_gid}'.format(project_gid='1331'),
            method='PUT',
            headers=headers,
            data=json.dumps(create_project_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
