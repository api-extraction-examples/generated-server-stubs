import unittest

from flask import json

from openapi_server.models.custom_field_configurations import CustomFieldConfigurations  # noqa: E501
from openapi_server.models.page_bean_contextual_configuration import PageBeanContextualConfiguration  # noqa: E501
from openapi_server.test import BaseTestCase


class TestIssueCustomFieldConfigurationAppsController(BaseTestCase):
    """IssueCustomFieldConfigurationAppsController integration test stubs"""

    def test_get_custom_field_configuration(self):
        """Test case for get_custom_field_configuration

        Get custom field configurations
        """
        query_string = [('id', [56]),
                        ('fieldContextId', [56]),
                        ('issueId', 56),
                        ('projectKeyOrId', 'project_key_or_id_example'),
                        ('issueTypeId', 'issue_type_id_example'),
                        ('startAt', 0),
                        ('maxResults', 100)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/app/field/{field_id_or_key}/context/configuration'.format(field_id_or_key='field_id_or_key_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_custom_field_configuration(self):
        """Test case for update_custom_field_configuration

        Update custom field configurations
        """
        custom_field_configurations = {"configurations":[{"fieldContextId":"fieldContextId","schema":"","configuration":"","id":"id"},{"fieldContextId":"fieldContextId","schema":"","configuration":"","id":"id"},{"fieldContextId":"fieldContextId","schema":"","configuration":"","id":"id"},{"fieldContextId":"fieldContextId","schema":"","configuration":"","id":"id"},{"fieldContextId":"fieldContextId","schema":"","configuration":"","id":"id"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/app/field/{field_id_or_key}/context/configuration'.format(field_id_or_key='field_id_or_key_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(custom_field_configurations),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
