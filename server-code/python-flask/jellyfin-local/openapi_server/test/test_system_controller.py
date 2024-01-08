import unittest

from flask import json

from openapi_server.models.end_point_info import EndPointInfo  # noqa: E501
from openapi_server.models.log_file import LogFile  # noqa: E501
from openapi_server.models.public_system_info import PublicSystemInfo  # noqa: E501
from openapi_server.models.system_info import SystemInfo  # noqa: E501
from openapi_server.models.wake_on_lan_info import WakeOnLanInfo  # noqa: E501
from openapi_server.test import BaseTestCase


class TestSystemController(BaseTestCase):
    """SystemController integration test stubs"""

    def test_get_endpoint_info(self):
        """Test case for get_endpoint_info

        Gets information about the request endpoint.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/System/Endpoint',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_log_file(self):
        """Test case for get_log_file

        Gets a log file.
        """
        query_string = [('name', 'name_example')]
        headers = { 
            'Accept': 'text/plain',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/System/Logs/Log',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_ping_system(self):
        """Test case for get_ping_system

        Pings the system.
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/System/Ping',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_public_system_info(self):
        """Test case for get_public_system_info

        Gets public information about the server.
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/System/Info/Public',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_server_logs(self):
        """Test case for get_server_logs

        Gets a list of available server log files.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/System/Logs',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_system_info(self):
        """Test case for get_system_info

        Gets information about the server.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/System/Info',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_wake_on_lan_info(self):
        """Test case for get_wake_on_lan_info

        Gets wake on lan information.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/System/WakeOnLanInfo',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_ping_system(self):
        """Test case for post_ping_system

        Pings the system.
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/System/Ping',
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_restart_application(self):
        """Test case for restart_application

        Restarts the application.
        """
        headers = { 
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/System/Restart',
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_shutdown_application(self):
        """Test case for shutdown_application

        Shuts down the application.
        """
        headers = { 
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/System/Shutdown',
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
