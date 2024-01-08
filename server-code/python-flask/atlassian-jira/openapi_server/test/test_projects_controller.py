import unittest

from flask import json

from openapi_server.models.create_project_details import CreateProjectDetails  # noqa: E501
from openapi_server.models.issue_type_with_status import IssueTypeWithStatus  # noqa: E501
from openapi_server.models.notification_scheme import NotificationScheme  # noqa: E501
from openapi_server.models.page_bean_project import PageBeanProject  # noqa: E501
from openapi_server.models.project import Project  # noqa: E501
from openapi_server.models.project_identifiers import ProjectIdentifiers  # noqa: E501
from openapi_server.models.project_issue_type_hierarchy import ProjectIssueTypeHierarchy  # noqa: E501
from openapi_server.models.task_progress_bean_object import TaskProgressBeanObject  # noqa: E501
from openapi_server.models.update_project_details import UpdateProjectDetails  # noqa: E501
from openapi_server.test import BaseTestCase


class TestProjectsController(BaseTestCase):
    """ProjectsController integration test stubs"""

    def test_archive_project(self):
        """Test case for archive_project

        Archive project
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/project/{project_id_or_key}/archive'.format(project_id_or_key='project_id_or_key_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_project(self):
        """Test case for create_project

        Create project
        """
        create_project_details = {"notificationScheme":7,"description":"description","leadAccountId":"leadAccountId","lead":"lead","url":"url","workflowScheme":3,"issueTypeScheme":5,"avatarId":0,"issueSecurityScheme":5,"projectTemplateKey":"com.pyxis.greenhopper.jira:gh-simplified-agility-kanban","name":"name","issueTypeScreenScheme":2,"permissionScheme":9,"assigneeType":"PROJECT_LEAD","fieldConfigurationScheme":1,"projectTypeKey":"software","categoryId":6,"key":"key"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/project',
            method='POST',
            headers=headers,
            data=json.dumps(create_project_details),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_project(self):
        """Test case for delete_project

        Delete project
        """
        query_string = [('enableUndo', False)]
        headers = { 
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/project/{project_id_or_key}'.format(project_id_or_key='project_id_or_key_example'),
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_project_asynchronously(self):
        """Test case for delete_project_asynchronously

        Delete project asynchronously
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/project/{project_id_or_key}/delete'.format(project_id_or_key='project_id_or_key_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_all_projects(self):
        """Test case for get_all_projects

        Get all projects
        """
        query_string = [('expand', 'expand_example'),
                        ('recent', 56),
                        ('properties', ['properties_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/project',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_all_statuses(self):
        """Test case for get_all_statuses

        Get all statuses for project
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/project/{project_id_or_key}/statuses'.format(project_id_or_key='project_id_or_key_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_hierarchy(self):
        """Test case for get_hierarchy

        Get project issue type hierarchy
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/project/{project_id}/hierarchy'.format(project_id=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_notification_scheme_for_project(self):
        """Test case for get_notification_scheme_for_project

        Get project notification scheme
        """
        query_string = [('expand', 'expand_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/project/{project_key_or_id}/notificationscheme'.format(project_key_or_id='project_key_or_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_project(self):
        """Test case for get_project

        Get project
        """
        query_string = [('expand', 'expand_example'),
                        ('properties', ['properties_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/project/{project_id_or_key}'.format(project_id_or_key='project_id_or_key_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_recent(self):
        """Test case for get_recent

        Get recent projects
        """
        query_string = [('expand', 'expand_example'),
                        ('properties', None)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/project/recent',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_restore(self):
        """Test case for restore

        Restore deleted or archived project
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/project/{project_id_or_key}/restore'.format(project_id_or_key='project_id_or_key_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_search_projects(self):
        """Test case for search_projects

        Get projects paginated
        """
        query_string = [('startAt', 0),
                        ('maxResults', 50),
                        ('orderBy', 'key'),
                        ('id', [56]),
                        ('keys', ['keys_example']),
                        ('query', 'query_example'),
                        ('typeKey', 'type_key_example'),
                        ('categoryId', 56),
                        ('action', 'view'),
                        ('expand', 'expand_example'),
                        ('status', ['status_example']),
                        ('properties', None),
                        ('propertyQuery', 'property_query_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/project/search',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_project(self):
        """Test case for update_project

        Update project
        """
        update_project_details = {"avatarId":0,"issueSecurityScheme":1,"notificationScheme":5,"name":"name","description":"description","permissionScheme":5,"assigneeType":"PROJECT_LEAD","leadAccountId":"leadAccountId","categoryId":6,"key":"key","lead":"lead","url":"url"}
        query_string = [('expand', 'expand_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/project/{project_id_or_key}'.format(project_id_or_key='project_id_or_key_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(update_project_details),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_project_type(self):
        """Test case for update_project_type

        Update project type
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/project/{project_id_or_key}/type/{new_project_type_key}'.format(project_id_or_key='project_id_or_key_example', new_project_type_key='new_project_type_key_example'),
            method='PUT',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
