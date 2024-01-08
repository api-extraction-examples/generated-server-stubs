import unittest

from flask import json

from openapi_server.models.patch_operation import PatchOperation  # noqa: E501
from openapi_server.models.post_webhook_request import PostWebhookRequest  # noqa: E501
from openapi_server.models.webhook import Webhook  # noqa: E501
from openapi_server.models.webhooks import Webhooks  # noqa: E501
from openapi_server.test import BaseTestCase


class TestWebhooksController(BaseTestCase):
    """WebhooksController integration test stubs"""

    def test_delete_webhook(self):
        """Test case for delete_webhook

        Delete a webhook by ID.
        """
        headers = { 
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/webhooks/{resource_id}'.format(resource_id='resource_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_webhook(self):
        """Test case for get_webhook

        Get a webhook by ID.
        """
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/webhooks/{resource_id}'.format(resource_id='resource_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_webhooks(self):
        """Test case for get_webhooks

        Fetch a list of all webhooks.
        """
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/webhooks',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_patch_webhook(self):
        """Test case for patch_webhook

        Modify a webhook by ID.
        """
        patch_delta = {"op":"replace","path":"/name","value":"My resource name"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/webhooks/{resource_id}'.format(resource_id='resource_id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(patch_delta),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_webhook(self):
        """Test case for post_webhook

        Create a webhook.
        """
        webhook_body = openapi_server.PostWebhookRequest()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/webhooks',
            method='POST',
            headers=headers,
            data=json.dumps(webhook_body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
