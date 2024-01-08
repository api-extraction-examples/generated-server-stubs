import unittest

from flask import json

from openapi_server.models.artifact import Artifact  # noqa: E501
from openapi_server.models.build import Build  # noqa: E501
from openapi_server.models.build_detail import BuildDetail  # noqa: E501
from openapi_server.models.build_summary import BuildSummary  # noqa: E501
from openapi_server.models.envvar import Envvar  # noqa: E501
from openapi_server.models.key import Key  # noqa: E501
from openapi_server.models.project import Project  # noqa: E501
from openapi_server.models.project_username_project_build_cache_delete200_response import ProjectUsernameProjectBuildCacheDelete200Response  # noqa: E501
from openapi_server.models.project_username_project_checkout_key_fingerprint_delete200_response import ProjectUsernameProjectCheckoutKeyFingerprintDelete200Response  # noqa: E501
from openapi_server.models.project_username_project_post_request import ProjectUsernameProjectPostRequest  # noqa: E501
from openapi_server.models.project_username_project_ssh_key_post_default_response import ProjectUsernameProjectSshKeyPostDefaultResponse  # noqa: E501
from openapi_server.models.project_username_project_ssh_key_post_request import ProjectUsernameProjectSshKeyPostRequest  # noqa: E501
from openapi_server.models.project_username_project_tree_branch_post_request import ProjectUsernameProjectTreeBranchPostRequest  # noqa: E501
from openapi_server.models.tests import Tests  # noqa: E501
from openapi_server.models.user import User  # noqa: E501
from openapi_server.test import BaseTestCase


class TestDefaultController(BaseTestCase):
    """DefaultController integration test stubs"""

    def test_me_get(self):
        """Test case for me_get

        
        """
        headers = { 
            'Accept': 'application/json',
            'apikey': 'special-key',
        }
        response = self.client.open(
            '/api/v1/me',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_project_username_project_build_cache_delete(self):
        """Test case for project_username_project_build_cache_delete

        
        """
        headers = { 
            'Accept': 'application/json',
            'apikey': 'special-key',
        }
        response = self.client.open(
            '/api/v1/project/{username}/{project}/build-cache'.format(username='username_example', project='project_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_project_username_project_build_num_artifacts_get(self):
        """Test case for project_username_project_build_num_artifacts_get

        
        """
        headers = { 
            'Accept': 'application/json',
            'apikey': 'special-key',
        }
        response = self.client.open(
            '/api/v1/project/{username}/{project}/{build_num}/artifacts'.format(username='username_example', project='project_example', build_num=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_project_username_project_build_num_cancel_post(self):
        """Test case for project_username_project_build_num_cancel_post

        
        """
        headers = { 
            'Accept': 'application/json',
            'apikey': 'special-key',
        }
        response = self.client.open(
            '/api/v1/project/{username}/{project}/{build_num}/cancel'.format(username='username_example', project='project_example', build_num=56),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_project_username_project_build_num_get(self):
        """Test case for project_username_project_build_num_get

        
        """
        headers = { 
            'Accept': 'application/json',
            'apikey': 'special-key',
        }
        response = self.client.open(
            '/api/v1/project/{username}/{project}/{build_num}'.format(username='username_example', project='project_example', build_num=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_project_username_project_build_num_retry_post(self):
        """Test case for project_username_project_build_num_retry_post

        
        """
        headers = { 
            'Accept': 'application/json',
            'apikey': 'special-key',
        }
        response = self.client.open(
            '/api/v1/project/{username}/{project}/{build_num}/retry'.format(username='username_example', project='project_example', build_num=56),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_project_username_project_build_num_tests_get(self):
        """Test case for project_username_project_build_num_tests_get

        
        """
        headers = { 
            'Accept': 'application/json',
            'apikey': 'special-key',
        }
        response = self.client.open(
            '/api/v1/project/{username}/{project}/{build_num}/tests'.format(username='username_example', project='project_example', build_num=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_project_username_project_checkout_key_fingerprint_delete(self):
        """Test case for project_username_project_checkout_key_fingerprint_delete

        
        """
        headers = { 
            'Accept': 'application/json',
            'apikey': 'special-key',
        }
        response = self.client.open(
            '/api/v1/project/{username}/{project}/checkout-key/{fingerprint}'.format(username='username_example', project='project_example', fingerprint='fingerprint_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_project_username_project_checkout_key_fingerprint_get(self):
        """Test case for project_username_project_checkout_key_fingerprint_get

        
        """
        headers = { 
            'Accept': 'application/json',
            'apikey': 'special-key',
        }
        response = self.client.open(
            '/api/v1/project/{username}/{project}/checkout-key/{fingerprint}'.format(username='username_example', project='project_example', fingerprint='fingerprint_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_project_username_project_checkout_key_get(self):
        """Test case for project_username_project_checkout_key_get

        
        """
        headers = { 
            'Accept': 'application/json',
            'apikey': 'special-key',
        }
        response = self.client.open(
            '/api/v1/project/{username}/{project}/checkout-key'.format(username='username_example', project='project_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_project_username_project_checkout_key_post(self):
        """Test case for project_username_project_checkout_key_post

        
        """
        body = 'body_example'
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'apikey': 'special-key',
        }
        response = self.client.open(
            '/api/v1/project/{username}/{project}/checkout-key'.format(username='username_example', project='project_example'),
            method='POST',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_project_username_project_envvar_get(self):
        """Test case for project_username_project_envvar_get

        
        """
        headers = { 
            'Accept': 'application/json',
            'apikey': 'special-key',
        }
        response = self.client.open(
            '/api/v1/project/{username}/{project}/envvar'.format(username='username_example', project='project_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_project_username_project_envvar_name_delete(self):
        """Test case for project_username_project_envvar_name_delete

        
        """
        headers = { 
            'Accept': 'application/json',
            'apikey': 'special-key',
        }
        response = self.client.open(
            '/api/v1/project/{username}/{project}/envvar/{name}'.format(username='username_example', project='project_example', name='name_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_project_username_project_envvar_name_get(self):
        """Test case for project_username_project_envvar_name_get

        
        """
        headers = { 
            'Accept': 'application/json',
            'apikey': 'special-key',
        }
        response = self.client.open(
            '/api/v1/project/{username}/{project}/envvar/{name}'.format(username='username_example', project='project_example', name='name_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_project_username_project_envvar_post(self):
        """Test case for project_username_project_envvar_post

        
        """
        headers = { 
            'Accept': 'application/json',
            'apikey': 'special-key',
        }
        response = self.client.open(
            '/api/v1/project/{username}/{project}/envvar'.format(username='username_example', project='project_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_project_username_project_get(self):
        """Test case for project_username_project_get

        
        """
        query_string = [('limit', 30),
                        ('offset', 0),
                        ('filter', 'filter_example')]
        headers = { 
            'Accept': 'application/json',
            'apikey': 'special-key',
        }
        response = self.client.open(
            '/api/v1/project/{username}/{project}'.format(username='username_example', project='project_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_project_username_project_post(self):
        """Test case for project_username_project_post

        
        """
        project_username_project_post_request = openapi_server.ProjectUsernameProjectPostRequest()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'apikey': 'special-key',
        }
        response = self.client.open(
            '/api/v1/project/{username}/{project}'.format(username='username_example', project='project_example'),
            method='POST',
            headers=headers,
            data=json.dumps(project_username_project_post_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_project_username_project_ssh_key_post(self):
        """Test case for project_username_project_ssh_key_post

        
        """
        project_username_project_ssh_key_post_request = openapi_server.ProjectUsernameProjectSshKeyPostRequest()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'content_type': 'content_type_example',
            'apikey': 'special-key',
        }
        response = self.client.open(
            '/api/v1/project/{username}/{project}/ssh-key'.format(username='username_example', project='project_example'),
            method='POST',
            headers=headers,
            data=json.dumps(project_username_project_ssh_key_post_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_project_username_project_tree_branch_post(self):
        """Test case for project_username_project_tree_branch_post

        
        """
        project_username_project_tree_branch_post_request = openapi_server.ProjectUsernameProjectTreeBranchPostRequest()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'apikey': 'special-key',
        }
        response = self.client.open(
            '/api/v1/project/{username}/{project}/tree/{branch}'.format(username='username_example', project='project_example', branch='branch_example'),
            method='POST',
            headers=headers,
            data=json.dumps(project_username_project_tree_branch_post_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_projects_get(self):
        """Test case for projects_get

        
        """
        headers = { 
            'Accept': 'application/json',
            'apikey': 'special-key',
        }
        response = self.client.open(
            '/api/v1/projects',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_recent_builds_get(self):
        """Test case for recent_builds_get

        
        """
        query_string = [('limit', 30),
                        ('offset', 0)]
        headers = { 
            'Accept': 'application/json',
            'apikey': 'special-key',
        }
        response = self.client.open(
            '/api/v1/recent-builds',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_user_heroku_key_post(self):
        """Test case for user_heroku_key_post

        
        """
        headers = { 
            'Accept': 'application/json',
            'apikey': 'special-key',
        }
        response = self.client.open(
            '/api/v1/user/heroku-key',
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
