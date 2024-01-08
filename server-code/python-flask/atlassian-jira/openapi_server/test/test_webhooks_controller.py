import unittest

from flask import json

from openapi_server.models.container_for_registered_webhooks import ContainerForRegisteredWebhooks  # noqa: E501
from openapi_server.models.container_for_webhook_ids import ContainerForWebhookIDs  # noqa: E501
from openapi_server.models.error_collection import ErrorCollection  # noqa: E501
from openapi_server.models.failed_webhooks import FailedWebhooks  # noqa: E501
from openapi_server.models.page_bean_webhook import PageBeanWebhook  # noqa: E501
from openapi_server.models.webhook_registration_details import WebhookRegistrationDetails  # noqa: E501
from openapi_server.models.webhooks_expiration_date import WebhooksExpirationDate  # noqa: E501
from openapi_server.test import BaseTestCase


class TestWebhooksController(BaseTestCase):
    """WebhooksController integration test stubs"""

    def test_delete_webhook_by_id(self):
        """Test case for delete_webhook_by_id

        Delete webhooks by ID
        """
        container_for_webhook_ids = {"webhookIds":[0,0]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/webhook',
            method='DELETE',
            headers=headers,
            data=json.dumps(container_for_webhook_ids),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_dynamic_webhooks_for_app(self):
        """Test case for get_dynamic_webhooks_for_app

        Get dynamic webhooks for app
        """
        query_string = [('startAt', 0),
                        ('maxResults', 100)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/webhook',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_failed_webhooks(self):
        """Test case for get_failed_webhooks

        Get failed webhooks
        """
        query_string = [('maxResults', 56),
                        ('after', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/webhook/failed',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_refresh_webhooks(self):
        """Test case for refresh_webhooks

        Extend webhook life
        """
        container_for_webhook_ids = {"webhookIds":[0,0]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/webhook/refresh',
            method='PUT',
            headers=headers,
            data=json.dumps(container_for_webhook_ids),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_register_dynamic_webhooks(self):
        """Test case for register_dynamic_webhooks

        Register dynamic webhooks
        """
        webhook_registration_details = {"webhooks":[{"jqlFilter":"jqlFilter","fieldIdsFilter":["fieldIdsFilter","fieldIdsFilter"],"issuePropertyKeysFilter":["issuePropertyKeysFilter","issuePropertyKeysFilter"],"events":["jira:issue_created","jira:issue_created"]},{"jqlFilter":"jqlFilter","fieldIdsFilter":["fieldIdsFilter","fieldIdsFilter"],"issuePropertyKeysFilter":["issuePropertyKeysFilter","issuePropertyKeysFilter"],"events":["jira:issue_created","jira:issue_created"]}],"url":"url"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/webhook',
            method='POST',
            headers=headers,
            data=json.dumps(webhook_registration_details),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
