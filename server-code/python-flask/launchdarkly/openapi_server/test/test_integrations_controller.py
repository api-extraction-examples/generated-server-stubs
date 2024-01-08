import unittest

from flask import json

from openapi_server.models.integration import Integration  # noqa: E501
from openapi_server.models.integration_subscription import IntegrationSubscription  # noqa: E501
from openapi_server.models.integrations import Integrations  # noqa: E501
from openapi_server.models.patch_operation import PatchOperation  # noqa: E501
from openapi_server.models.post_integration_subscription_request import PostIntegrationSubscriptionRequest  # noqa: E501
from openapi_server.models.usage_error import UsageError  # noqa: E501
from openapi_server.test import BaseTestCase


class TestIntegrationsController(BaseTestCase):
    """IntegrationsController integration test stubs"""

    def test_delete_integration_subscription(self):
        """Test case for delete_integration_subscription

        Delete an integration subscription by ID.
        """
        headers = { 
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/integrations/{integration_key}/{integration_id}'.format(integration_key='integration_key_example', integration_id='integration_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_integration_subscription(self):
        """Test case for get_integration_subscription

        Get a single integration subscription by ID.
        """
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/integrations/{integration_key}/{integration_id}'.format(integration_key='integration_key_example', integration_id='integration_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_integration_subscriptions(self):
        """Test case for get_integration_subscriptions

        Get a list of all configured integrations of a given kind.
        """
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/integrations/{integration_key}'.format(integration_key='integration_key_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_integrations(self):
        """Test case for get_integrations

        Get a list of all configured audit log event integrations associated with this account.
        """
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/integrations',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_patch_integration_subscription(self):
        """Test case for patch_integration_subscription

        Modify an integration subscription by ID.
        """
        patch_delta = {"op":"replace","path":"/name","value":"My resource name"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/integrations/{integration_key}/{integration_id}'.format(integration_key='integration_key_example', integration_id='integration_id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(patch_delta),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_integration_subscription(self):
        """Test case for post_integration_subscription

        Create a new integration subscription of a given kind.
        """
        subscription_body = openapi_server.PostIntegrationSubscriptionRequest()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/integrations/{integration_key}'.format(integration_key='integration_key_example'),
            method='POST',
            headers=headers,
            data=json.dumps(subscription_body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
