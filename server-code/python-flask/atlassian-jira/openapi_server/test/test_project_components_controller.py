import unittest

from flask import json

from openapi_server.models.component_issues_count import ComponentIssuesCount  # noqa: E501
from openapi_server.models.page_bean_component_with_issue_count import PageBeanComponentWithIssueCount  # noqa: E501
from openapi_server.models.project_component import ProjectComponent  # noqa: E501
from openapi_server.test import BaseTestCase


class TestProjectComponentsController(BaseTestCase):
    """ProjectComponentsController integration test stubs"""

    def test_create_component(self):
        """Test case for create_component

        Create component
        """
        project_component = {"leadUserName":"leadUserName","description":"description","project":"project","leadAccountId":"leadAccountId","isAssigneeTypeValid":True,"realAssigneeType":"PROJECT_DEFAULT","name":"name","self":"https://openapi-generator.tech","assigneeType":"PROJECT_DEFAULT","id":"id","projectId":0}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/component',
            method='POST',
            headers=headers,
            data=json.dumps(project_component),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_component(self):
        """Test case for delete_component

        Delete component
        """
        query_string = [('moveIssuesTo', 'move_issues_to_example')]
        headers = { 
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/component/{id}'.format(id='id_example'),
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_component(self):
        """Test case for get_component

        Get component
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/component/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_component_related_issues(self):
        """Test case for get_component_related_issues

        Get component issues count
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/component/{id}/relatedIssueCounts'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_project_components(self):
        """Test case for get_project_components

        Get project components
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/project/{project_id_or_key}/components'.format(project_id_or_key='project_id_or_key_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_project_components_paginated(self):
        """Test case for get_project_components_paginated

        Get project components paginated
        """
        query_string = [('startAt', 0),
                        ('maxResults', 50),
                        ('orderBy', 'order_by_example'),
                        ('query', 'query_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/project/{project_id_or_key}/component'.format(project_id_or_key='project_id_or_key_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_component(self):
        """Test case for update_component

        Update component
        """
        project_component = {"leadUserName":"leadUserName","description":"description","project":"project","leadAccountId":"leadAccountId","isAssigneeTypeValid":True,"realAssigneeType":"PROJECT_DEFAULT","name":"name","self":"https://openapi-generator.tech","assigneeType":"PROJECT_DEFAULT","id":"id","projectId":0}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/component/{id}'.format(id='id_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(project_component),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
