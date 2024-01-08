import unittest

from flask import json

from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.execute_request import ExecuteRequest  # noqa: E501
from openapi_server.models.execute_response import ExecuteResponse  # noqa: E501
from openapi_server.models.exposed_action_response_schema import ExposedActionResponseSchema  # noqa: E501
from openapi_server.test import BaseTestCase


class TestDefaultController(BaseTestCase):
    """DefaultController integration test stubs"""

    def test_check(self):
        """Test case for check

        Check
        """
        headers = { 
            'AccessPointApiKeyQuery': 'special-key',
            'SessionAuth': 'special-key',
            'AccessPointApiKeyHeader': 'special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/check/',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_execute_app_action_endpoint(self):
        """Test case for execute_app_action_endpoint

        Execute App Action Endpoint
        """
        execute_request = {"instructions":"instructions","preview_only":False}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'AccessPointApiKeyQuery': 'special-key',
            'SessionAuth': 'special-key',
            'AccessPointApiKeyHeader': 'special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/exposed/{exposed_app_action_id}/execute'.format(exposed_app_action_id='exposed_app_action_id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(execute_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_configuration_link(self):
        """Test case for get_configuration_link

        Get Configuration Link
        """
        headers = { 
            'AccessPointApiKeyQuery': 'special-key',
            'SessionAuth': 'special-key',
            'AccessPointApiKeyHeader': 'special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/configuration-link/',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_execution_log_endpoint(self):
        """Test case for get_execution_log_endpoint

        Get Execution Log Endpoint
        """
        headers = { 
            'Accept': 'application/json',
            'AccessPointApiKeyQuery': 'special-key',
            'SessionAuth': 'special-key',
            'AccessPointApiKeyHeader': 'special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/execution-log/{execution_log_id}'.format(execution_log_id='execution_log_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_exposed_actions(self):
        """Test case for list_exposed_actions

        List Exposed Actions
        """
        headers = { 
            'Accept': 'application/json',
            'AccessPointApiKeyQuery': 'special-key',
            'SessionAuth': 'special-key',
            'AccessPointApiKeyHeader': 'special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/exposed/',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
