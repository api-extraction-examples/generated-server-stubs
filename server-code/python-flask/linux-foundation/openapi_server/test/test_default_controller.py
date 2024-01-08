import unittest

from flask import json

from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.health import Health  # noqa: E501
from openapi_server.models.policy_reset_input import PolicyResetInput  # noqa: E501
from openapi_server.models.policy_tag_input import PolicyTagInput  # noqa: E501
from openapi_server.test import BaseTestCase


class TestDefaultController(BaseTestCase):
    """DefaultController integration test stubs"""

    def test_expense_action(self):
        """Test case for expense_action

        Expense Action
        """
        headers = { 
            'Accept': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/v1/expense/{action}/{report_id}'.format(action='action_example', report_id='report_id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_health_check(self):
        """Test case for health_check

        Get API Health Status
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/health',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_reset_policy(self):
        """Test case for reset_policy

        Reset Policy
        """
        body = openapi_server.PolicyResetInput()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/v1/reset',
            method='POST',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_tag_policy(self):
        """Test case for tag_policy

        Tag Policy
        """
        body = openapi_server.PolicyTagInput()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/v1/tag',
            method='POST',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
