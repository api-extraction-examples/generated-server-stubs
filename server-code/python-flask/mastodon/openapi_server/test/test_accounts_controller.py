import unittest

from flask import json

from openapi_server.models.account import Account  # noqa: E501
from openapi_server.models.api_v1_accounts_id_follow_post_request import ApiV1AccountsIdFollowPostRequest  # noqa: E501
from openapi_server.models.api_v1_accounts_id_mute_post_request import ApiV1AccountsIdMutePostRequest  # noqa: E501
from openapi_server.models.api_v1_accounts_id_note_post_request import ApiV1AccountsIdNotePostRequest  # noqa: E501
from openapi_server.models.api_v1_accounts_post_request import ApiV1AccountsPostRequest  # noqa: E501
from openapi_server.models.api_v1_accounts_update_credentials_patch_request import ApiV1AccountsUpdateCredentialsPatchRequest  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.featured_tag import FeaturedTag  # noqa: E501
from openapi_server.models.identity_proof import IdentityProof  # noqa: E501
from openapi_server.models.relationship import Relationship  # noqa: E501
from openapi_server.models.status import Status  # noqa: E501
from openapi_server.test import BaseTestCase


class TestAccountsController(BaseTestCase):
    """AccountsController integration test stubs"""

    def test_api_v1_accounts_id_block_post(self):
        """Test case for api_v1_accounts_id_block_post

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/accounts/{id}/block'.format(id='id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_accounts_id_featured_tags_get(self):
        """Test case for api_v1_accounts_id_featured_tags_get

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/accounts/{id}/featured_tags'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("application/form-data not supported by Connexion")
    def test_api_v1_accounts_id_follow_post(self):
        """Test case for api_v1_accounts_id_follow_post

        
        """
        api_v1_accounts_id_follow_post_request = openapi_server.ApiV1AccountsIdFollowPostRequest()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/form-data',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/accounts/{id}/follow'.format(id='id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(api_v1_accounts_id_follow_post_request),
            content_type='application/form-data')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_accounts_id_followers_get(self):
        """Test case for api_v1_accounts_id_followers_get

        
        """
        query_string = [('max_id', 'max_id_example'),
                        ('since_id', 'since_id_example'),
                        ('limit', 40)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/accounts/{id}/followers'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_accounts_id_following_get(self):
        """Test case for api_v1_accounts_id_following_get

        
        """
        query_string = [('max_id', 'max_id_example'),
                        ('since_id', 'since_id_example'),
                        ('limit', 40)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/accounts/{id}/following'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_accounts_id_get(self):
        """Test case for api_v1_accounts_id_get

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/accounts/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_accounts_id_identity_proofs_get(self):
        """Test case for api_v1_accounts_id_identity_proofs_get

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/accounts/{id}/identity_proofs'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_accounts_id_lists_get(self):
        """Test case for api_v1_accounts_id_lists_get

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/accounts/{id}/lists'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("application/form-data not supported by Connexion")
    def test_api_v1_accounts_id_mute_post(self):
        """Test case for api_v1_accounts_id_mute_post

        
        """
        api_v1_accounts_id_mute_post_request = openapi_server.ApiV1AccountsIdMutePostRequest()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/form-data',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/accounts/{id}/mute'.format(id='id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(api_v1_accounts_id_mute_post_request),
            content_type='application/form-data')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("application/form-data not supported by Connexion")
    def test_api_v1_accounts_id_note_post(self):
        """Test case for api_v1_accounts_id_note_post

        
        """
        api_v1_accounts_id_note_post_request = openapi_server.ApiV1AccountsIdNotePostRequest()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/form-data',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/accounts/{id}/note'.format(id='id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(api_v1_accounts_id_note_post_request),
            content_type='application/form-data')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_accounts_id_pin_post(self):
        """Test case for api_v1_accounts_id_pin_post

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/accounts/{id}/pin'.format(id='id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_accounts_id_statuses_get(self):
        """Test case for api_v1_accounts_id_statuses_get

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/accounts/{id}/statuses'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_accounts_id_unblock_post(self):
        """Test case for api_v1_accounts_id_unblock_post

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/accounts/{id}/unblock'.format(id='id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_accounts_id_unfollow_post(self):
        """Test case for api_v1_accounts_id_unfollow_post

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/accounts/{id}/unfollow'.format(id='id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_accounts_id_unmute_post(self):
        """Test case for api_v1_accounts_id_unmute_post

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/accounts/{id}/unmute'.format(id='id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_accounts_id_unpin_post(self):
        """Test case for api_v1_accounts_id_unpin_post

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/accounts/{id}/unpin'.format(id='id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("application/form-data not supported by Connexion")
    def test_api_v1_accounts_post(self):
        """Test case for api_v1_accounts_post

        
        """
        api_v1_accounts_post_request = openapi_server.ApiV1AccountsPostRequest()
        headers = { 
            'Content-Type': 'application/form-data',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/accounts',
            method='POST',
            headers=headers,
            data=json.dumps(api_v1_accounts_post_request),
            content_type='application/form-data')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_accounts_relationships_get(self):
        """Test case for api_v1_accounts_relationships_get

        
        """
        query_string = [('id', ['id_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/accounts/relationships',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_accounts_search_get(self):
        """Test case for api_v1_accounts_search_get

        
        """
        query_string = [('q', 'q_example'),
                        ('limit', 40),
                        ('resolve', 'resolve_example'),
                        ('following', True)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/accounts/search',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("application/form-data not supported by Connexion")
    def test_api_v1_accounts_update_credentials_patch(self):
        """Test case for api_v1_accounts_update_credentials_patch

        
        """
        api_v1_accounts_update_credentials_patch_request = openapi_server.ApiV1AccountsUpdateCredentialsPatchRequest()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/form-data',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/accounts/update_credentials',
            method='PATCH',
            headers=headers,
            data=json.dumps(api_v1_accounts_update_credentials_patch_request),
            content_type='application/form-data')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_accounts_verify_credentials_get(self):
        """Test case for api_v1_accounts_verify_credentials_get

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/accounts/verify_credentials',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
