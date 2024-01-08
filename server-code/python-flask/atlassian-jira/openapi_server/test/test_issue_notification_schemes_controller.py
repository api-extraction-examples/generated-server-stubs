import unittest

from flask import json

from openapi_server.models.add_notifications_details import AddNotificationsDetails  # noqa: E501
from openapi_server.models.create_notification_scheme_details import CreateNotificationSchemeDetails  # noqa: E501
from openapi_server.models.error_collection import ErrorCollection  # noqa: E501
from openapi_server.models.notification_scheme import NotificationScheme  # noqa: E501
from openapi_server.models.notification_scheme_id import NotificationSchemeId  # noqa: E501
from openapi_server.models.page_bean_notification_scheme import PageBeanNotificationScheme  # noqa: E501
from openapi_server.models.page_bean_notification_scheme_and_project_mapping_json_bean import PageBeanNotificationSchemeAndProjectMappingJsonBean  # noqa: E501
from openapi_server.models.update_notification_scheme_details import UpdateNotificationSchemeDetails  # noqa: E501
from openapi_server.test import BaseTestCase


class TestIssueNotificationSchemesController(BaseTestCase):
    """IssueNotificationSchemesController integration test stubs"""

    def test_add_notifications(self):
        """Test case for add_notifications

        Add notifications to notification scheme
        """
        add_notifications_details = {"notificationSchemeEvents":[{"event":"","notifications":[{"parameter":"parameter","notificationType":"notificationType"},{"parameter":"parameter","notificationType":"notificationType"}]},{"event":"","notifications":[{"parameter":"parameter","notificationType":"notificationType"},{"parameter":"parameter","notificationType":"notificationType"}]}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/notificationscheme/{id}/notification'.format(id='id_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(add_notifications_details),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_notification_scheme(self):
        """Test case for create_notification_scheme

        Create notification scheme
        """
        create_notification_scheme_details = {"name":"name","description":"description","notificationSchemeEvents":[{"event":"","notifications":[{"parameter":"parameter","notificationType":"notificationType"},{"parameter":"parameter","notificationType":"notificationType"}]},{"event":"","notifications":[{"parameter":"parameter","notificationType":"notificationType"},{"parameter":"parameter","notificationType":"notificationType"}]}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/notificationscheme',
            method='POST',
            headers=headers,
            data=json.dumps(create_notification_scheme_details),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_notification_scheme(self):
        """Test case for delete_notification_scheme

        Delete notification scheme
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/notificationscheme/{notification_scheme_id}'.format(notification_scheme_id='notification_scheme_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_notification_scheme(self):
        """Test case for get_notification_scheme

        Get notification scheme
        """
        query_string = [('expand', 'expand_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/notificationscheme/{id}'.format(id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_notification_scheme_to_project_mappings(self):
        """Test case for get_notification_scheme_to_project_mappings

        Get projects using notification schemes paginated
        """
        query_string = [('startAt', '0'),
                        ('maxResults', '50'),
                        ('notificationSchemeId', ['notification_scheme_id_example']),
                        ('projectId', ['project_id_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/notificationscheme/project',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_notification_schemes(self):
        """Test case for get_notification_schemes

        Get notification schemes paginated
        """
        query_string = [('startAt', '0'),
                        ('maxResults', '50'),
                        ('id', ['id_example']),
                        ('projectId', ['project_id_example']),
                        ('onlyDefault', False),
                        ('expand', 'expand_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/notificationscheme',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_remove_notification_from_notification_scheme(self):
        """Test case for remove_notification_from_notification_scheme

        Remove notification from notification scheme
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/notificationscheme/{notification_scheme_id}/notification/{notification_id}'.format(notification_scheme_id='notification_scheme_id_example', notification_id='notification_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_notification_scheme(self):
        """Test case for update_notification_scheme

        Update notification scheme
        """
        update_notification_scheme_details = {"name":"name","description":"description"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/notificationscheme/{id}'.format(id='id_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(update_notification_scheme_details),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
