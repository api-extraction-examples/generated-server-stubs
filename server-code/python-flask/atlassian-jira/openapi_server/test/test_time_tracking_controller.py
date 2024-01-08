import unittest

from flask import json

from openapi_server.models.time_tracking_configuration import TimeTrackingConfiguration  # noqa: E501
from openapi_server.models.time_tracking_provider import TimeTrackingProvider  # noqa: E501
from openapi_server.test import BaseTestCase


class TestTimeTrackingController(BaseTestCase):
    """TimeTrackingController integration test stubs"""

    def test_get_available_time_tracking_implementations(self):
        """Test case for get_available_time_tracking_implementations

        Get all time tracking providers
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/configuration/timetracking/list',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_selected_time_tracking_implementation(self):
        """Test case for get_selected_time_tracking_implementation

        Get selected time tracking provider
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/configuration/timetracking',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_shared_time_tracking_configuration(self):
        """Test case for get_shared_time_tracking_configuration

        Get time tracking settings
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/configuration/timetracking/options',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_select_time_tracking_implementation(self):
        """Test case for select_time_tracking_implementation

        Select time tracking provider
        """
        time_tracking_provider = {"name":"name","key":"key","url":"url"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/configuration/timetracking',
            method='PUT',
            headers=headers,
            data=json.dumps(time_tracking_provider),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_set_shared_time_tracking_configuration(self):
        """Test case for set_shared_time_tracking_configuration

        Set time tracking settings
        """
        time_tracking_configuration = {"defaultUnit":"minute","workingHoursPerDay":6.027456183070403,"timeFormat":"pretty","workingDaysPerWeek":0.8008281904610115}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/configuration/timetracking/options',
            method='PUT',
            headers=headers,
            data=json.dumps(time_tracking_configuration),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
