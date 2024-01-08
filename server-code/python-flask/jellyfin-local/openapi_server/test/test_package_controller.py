import unittest

from flask import json

from openapi_server.models.package_info import PackageInfo  # noqa: E501
from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server.models.repository_info import RepositoryInfo  # noqa: E501
from openapi_server.test import BaseTestCase


class TestPackageController(BaseTestCase):
    """PackageController integration test stubs"""

    def test_cancel_package_installation(self):
        """Test case for cancel_package_installation

        Cancels a package installation.
        """
        headers = { 
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Packages/Installing/{package_id}'.format(package_id='package_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_package_info(self):
        """Test case for get_package_info

        Gets a package by name or assembly GUID.
        """
        query_string = [('assemblyGuid', 'assembly_guid_example')]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Packages/{name}'.format(name='name_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_packages(self):
        """Test case for get_packages

        Gets available packages.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Packages',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_repositories(self):
        """Test case for get_repositories

        Gets all package repositories.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Repositories',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_install_package(self):
        """Test case for install_package

        Installs a package.
        """
        query_string = [('assemblyGuid', 'assembly_guid_example'),
                        ('version', 'version_example'),
                        ('repositoryUrl', 'repository_url_example')]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Packages/Installed/{name}'.format(name='name_example'),
            method='POST',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_set_repositories(self):
        """Test case for set_repositories

        Sets the enabled and existing package repositories.
        """
        repository_info = {"Enabled":True,"Url":"Url","Name":"Name"}
        headers = { 
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Repositories',
            method='POST',
            headers=headers,
            data=json.dumps(repository_info),
            content_type='application/*+json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
