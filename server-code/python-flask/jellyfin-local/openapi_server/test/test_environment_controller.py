import unittest

from flask import json

from openapi_server.models.default_directory_browser_info_dto import DefaultDirectoryBrowserInfoDto  # noqa: E501
from openapi_server.models.file_system_entry_info import FileSystemEntryInfo  # noqa: E501
from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server.models.validate_path_dto import ValidatePathDto  # noqa: E501
from openapi_server.test import BaseTestCase


class TestEnvironmentController(BaseTestCase):
    """EnvironmentController integration test stubs"""

    def test_get_default_directory_browser(self):
        """Test case for get_default_directory_browser

        Get Default directory browser.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Environment/DefaultDirectoryBrowser',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_directory_contents(self):
        """Test case for get_directory_contents

        Gets the contents of a given directory in the file system.
        """
        query_string = [('path', 'path_example'),
                        ('includeFiles', False),
                        ('includeDirectories', False)]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Environment/DirectoryContents',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_drives(self):
        """Test case for get_drives

        Gets available drives from the server's file system.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Environment/Drives',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_network_shares(self):
        """Test case for get_network_shares

        Gets network paths.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Environment/NetworkShares',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_parent_path(self):
        """Test case for get_parent_path

        Gets the parent path of a given path.
        """
        query_string = [('path', 'path_example')]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Environment/ParentPath',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_validate_path(self):
        """Test case for validate_path

        Validates path.
        """
        validate_path_dto = {"Path":"Path","IsFile":True,"ValidateWritable":True}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Environment/ValidatePath',
            method='POST',
            headers=headers,
            data=json.dumps(validate_path_dto),
            content_type='application/*+json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
