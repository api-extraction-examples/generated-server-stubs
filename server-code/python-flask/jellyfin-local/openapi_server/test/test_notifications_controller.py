import unittest

from flask import json

from openapi_server.models.name_id_pair import NameIdPair  # noqa: E501
from openapi_server.models.notification_level import NotificationLevel  # noqa: E501
from openapi_server.models.notification_result_dto import NotificationResultDto  # noqa: E501
from openapi_server.models.notification_type_info import NotificationTypeInfo  # noqa: E501
from openapi_server.models.notifications_summary_dto import NotificationsSummaryDto  # noqa: E501
from openapi_server.test import BaseTestCase


class TestNotificationsController(BaseTestCase):
    """NotificationsController integration test stubs"""

    def test_create_admin_notification(self):
        """Test case for create_admin_notification

        Sends a notification to all admins.
        """
        query_string = [('url', 'url_example'),
                        ('level', openapi_server.NotificationLevel()),
                        ('name', ''),
                        ('description', '')]
        headers = { 
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Notifications/Admin',
            method='POST',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_notification_services(self):
        """Test case for get_notification_services

        Gets notification services.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Notifications/Services',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_notification_types(self):
        """Test case for get_notification_types

        Gets notification types.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Notifications/Types',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_notifications(self):
        """Test case for get_notifications

        Gets a user's notifications.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Notifications/{user_id}'.format(user_id='user_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_notifications_summary(self):
        """Test case for get_notifications_summary

        Gets a user's notification summary.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Notifications/{user_id}/Summary'.format(user_id='user_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_set_read(self):
        """Test case for set_read

        Sets notifications as read.
        """
        headers = { 
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Notifications/{user_id}/Read'.format(user_id='user_id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_set_unread(self):
        """Test case for set_unread

        Sets notifications as unread.
        """
        headers = { 
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Notifications/{user_id}/Unread'.format(user_id='user_id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
