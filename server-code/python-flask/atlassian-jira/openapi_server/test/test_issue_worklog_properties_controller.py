import unittest

from flask import json

from openapi_server.models.entity_property import EntityProperty  # noqa: E501
from openapi_server.models.property_keys import PropertyKeys  # noqa: E501
from openapi_server.test import BaseTestCase


class TestIssueWorklogPropertiesController(BaseTestCase):
    """IssueWorklogPropertiesController integration test stubs"""

    def test_delete_worklog_property(self):
        """Test case for delete_worklog_property

        Delete worklog property
        """
        headers = { 
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issue/{issue_id_or_key}/worklog/{worklog_id}/properties/{property_key}'.format(issue_id_or_key='issue_id_or_key_example', worklog_id='worklog_id_example', property_key='property_key_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_worklog_property(self):
        """Test case for get_worklog_property

        Get worklog property
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issue/{issue_id_or_key}/worklog/{worklog_id}/properties/{property_key}'.format(issue_id_or_key='issue_id_or_key_example', worklog_id='worklog_id_example', property_key='property_key_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_worklog_property_keys(self):
        """Test case for get_worklog_property_keys

        Get worklog property keys
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issue/{issue_id_or_key}/worklog/{worklog_id}/properties'.format(issue_id_or_key='issue_id_or_key_example', worklog_id='worklog_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_set_worklog_property(self):
        """Test case for set_worklog_property

        Set worklog property
        """
        body = None
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issue/{issue_id_or_key}/worklog/{worklog_id}/properties/{property_key}'.format(issue_id_or_key='issue_id_or_key_example', worklog_id='worklog_id_example', property_key='property_key_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
