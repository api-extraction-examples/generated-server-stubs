import unittest

from flask import json

from openapi_server.models.issue_field_option import IssueFieldOption  # noqa: E501
from openapi_server.models.issue_field_option_create_bean import IssueFieldOptionCreateBean  # noqa: E501
from openapi_server.models.page_bean_issue_field_option import PageBeanIssueFieldOption  # noqa: E501
from openapi_server.models.task_progress_bean_remove_option_from_issues_result import TaskProgressBeanRemoveOptionFromIssuesResult  # noqa: E501
from openapi_server.test import BaseTestCase


class TestIssueCustomFieldOptionsAppsController(BaseTestCase):
    """IssueCustomFieldOptionsAppsController integration test stubs"""

    def test_create_issue_field_option(self):
        """Test case for create_issue_field_option

        Create issue field option
        """
        issue_field_option_create_bean = {"config":{"scope":"","attributes":["notSelectable","notSelectable"]},"value":"value","properties":{"key":""}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/field/{field_key}/option'.format(field_key='field_key_example'),
            method='POST',
            headers=headers,
            data=json.dumps(issue_field_option_create_bean),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_issue_field_option(self):
        """Test case for delete_issue_field_option

        Delete issue field option
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/field/{field_key}/option/{option_id}'.format(field_key='field_key_example', option_id=56),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_all_issue_field_options(self):
        """Test case for get_all_issue_field_options

        Get all issue field options
        """
        query_string = [('startAt', 0),
                        ('maxResults', 50)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/field/{field_key}/option'.format(field_key='field_key_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_issue_field_option(self):
        """Test case for get_issue_field_option

        Get issue field option
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/field/{field_key}/option/{option_id}'.format(field_key='field_key_example', option_id=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_selectable_issue_field_options(self):
        """Test case for get_selectable_issue_field_options

        Get selectable issue field options
        """
        query_string = [('startAt', 0),
                        ('maxResults', 50),
                        ('projectId', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/field/{field_key}/option/suggestions/edit'.format(field_key='field_key_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_visible_issue_field_options(self):
        """Test case for get_visible_issue_field_options

        Get visible issue field options
        """
        query_string = [('startAt', 0),
                        ('maxResults', 56),
                        ('projectId', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/field/{field_key}/option/suggestions/search'.format(field_key='field_key_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_replace_issue_field_option(self):
        """Test case for replace_issue_field_option

        Replace issue field option
        """
        query_string = [('replaceWith', 56),
                        ('jql', 'jql_example'),
                        ('overrideScreenSecurity', False),
                        ('overrideEditableFlag', False)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/field/{field_key}/option/{option_id}/issue'.format(field_key='field_key_example', option_id=56),
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_issue_field_option(self):
        """Test case for update_issue_field_option

        Update issue field option
        """
        issue_field_option = {"id":5,"config":{"scope":"","attributes":["notSelectable","notSelectable"]},"value":"value","properties":{"key":""}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/field/{field_key}/option/{option_id}'.format(field_key='field_key_example', option_id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(issue_field_option),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
