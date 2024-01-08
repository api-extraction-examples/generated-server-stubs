import unittest

from flask import json

from openapi_server.models.account import Account  # noqa: E501
from openapi_server.models.activity import Activity  # noqa: E501
from openapi_server.models.admin_account import AdminAccount  # noqa: E501
from openapi_server.models.admin_report import AdminReport  # noqa: E501
from openapi_server.models.announcement import Announcement  # noqa: E501
from openapi_server.models.api_v1_admin_accounts_id_action_post_request import ApiV1AdminAccountsIdActionPostRequest  # noqa: E501
from openapi_server.models.api_v1_domain_blocks_post_request import ApiV1DomainBlocksPostRequest  # noqa: E501
from openapi_server.models.api_v1_featured_tags_post_request import ApiV1FeaturedTagsPostRequest  # noqa: E501
from openapi_server.models.api_v1_filters_post_request import ApiV1FiltersPostRequest  # noqa: E501
from openapi_server.models.api_v1_lists_id_accounts_post_request import ApiV1ListsIdAccountsPostRequest  # noqa: E501
from openapi_server.models.api_v1_lists_post_request import ApiV1ListsPostRequest  # noqa: E501
from openapi_server.models.api_v1_lists_put_request import ApiV1ListsPutRequest  # noqa: E501
from openapi_server.models.api_v1_media_post_request import ApiV1MediaPostRequest  # noqa: E501
from openapi_server.models.api_v1_polls_id_post_request import ApiV1PollsIdPostRequest  # noqa: E501
from openapi_server.models.api_v1_push_subscription_post_request import ApiV1PushSubscriptionPostRequest  # noqa: E501
from openapi_server.models.api_v1_push_subscription_put_request import ApiV1PushSubscriptionPutRequest  # noqa: E501
from openapi_server.models.api_v1_reports_post_request import ApiV1ReportsPostRequest  # noqa: E501
from openapi_server.models.api_v1_scheduled_statuses_id_put_request import ApiV1ScheduledStatusesIdPutRequest  # noqa: E501
from openapi_server.models.api_v1_statuses_id_reblog_post_request import ApiV1StatusesIdReblogPostRequest  # noqa: E501
from openapi_server.models.api_v1_statuses_post200_response import ApiV1StatusesPost200Response  # noqa: E501
from openapi_server.models.api_v1_statuses_post_request_inner import ApiV1StatusesPostRequestInner  # noqa: E501
from openapi_server.models.api_v2_search_get200_response import ApiV2SearchGet200Response  # noqa: E501
from openapi_server.models.attachment import Attachment  # noqa: E501
from openapi_server.models.card import Card  # noqa: E501
from openapi_server.models.context import Context  # noqa: E501
from openapi_server.models.conversation import Conversation  # noqa: E501
from openapi_server.models.emoji import Emoji  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.featured_tag import FeaturedTag  # noqa: E501
from openapi_server.models.filter import Filter  # noqa: E501
from openapi_server.models.identity_proof import IdentityProof  # noqa: E501
from openapi_server.models.instance import Instance  # noqa: E501
from openapi_server.models.notification import Notification  # noqa: E501
from openapi_server.models.poll import Poll  # noqa: E501
from openapi_server.models.preferences import Preferences  # noqa: E501
from openapi_server.models.push_subscription import PushSubscription  # noqa: E501
from openapi_server.models.relationship import Relationship  # noqa: E501
from openapi_server.models.report import Report  # noqa: E501
from openapi_server.models.scheduled_status import ScheduledStatus  # noqa: E501
from openapi_server.models.status import Status  # noqa: E501
from openapi_server.models.tag import Tag  # noqa: E501
from openapi_server.test import BaseTestCase


class TestDefaultController(BaseTestCase):
    """DefaultController integration test stubs"""

    def test_api_oembed_get(self):
        """Test case for api_oembed_get

        
        """
        query_string = [('url', 'url_example'),
                        ('maxwidth', 400),
                        ('maxheight', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/oembed',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_proofs_get(self):
        """Test case for api_proofs_get

        
        """
        query_string = [('provider', 'provider_example'),
                        ('username', 'username_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/proofs',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_admin_accounts_get(self):
        """Test case for api_v1_admin_accounts_get

        
        """
        query_string = [('local', True),
                        ('remote', True),
                        ('by_domain', 'by_domain_example'),
                        ('active', True),
                        ('pending', True),
                        ('disabled', True),
                        ('silenced', True),
                        ('suspended', True),
                        ('staff', True),
                        ('username', 'username_example'),
                        ('display_name', 'display_name_example'),
                        ('email', 'email_example'),
                        ('ip', 'ip_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/admin/accounts',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_admin_accounts_id_action_post(self):
        """Test case for api_v1_admin_accounts_id_action_post

        
        """
        api_v1_admin_accounts_id_action_post_request = openapi_server.ApiV1AdminAccountsIdActionPostRequest()
        headers = { 
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/admin/accounts/{id}/action'.format(id='id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(api_v1_admin_accounts_id_action_post_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_admin_accounts_id_approve_post(self):
        """Test case for api_v1_admin_accounts_id_approve_post

        
        """
        headers = { 
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/admin/accounts/{id}/approve'.format(id='id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_admin_accounts_id_enable_post(self):
        """Test case for api_v1_admin_accounts_id_enable_post

        
        """
        headers = { 
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/admin/accounts/{id}/enable'.format(id='id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_admin_accounts_id_get(self):
        """Test case for api_v1_admin_accounts_id_get

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/admin/accounts/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_admin_accounts_id_reject_post(self):
        """Test case for api_v1_admin_accounts_id_reject_post

        
        """
        headers = { 
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/admin/accounts/{id}/reject'.format(id='id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_admin_accounts_id_unsilence_post(self):
        """Test case for api_v1_admin_accounts_id_unsilence_post

        
        """
        headers = { 
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/admin/accounts/{id}/unsilence'.format(id='id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_admin_accounts_id_unsuspend_post(self):
        """Test case for api_v1_admin_accounts_id_unsuspend_post

        
        """
        headers = { 
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/admin/accounts/{id}/unsuspend'.format(id='id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_admin_reports_get(self):
        """Test case for api_v1_admin_reports_get

        
        """
        query_string = [('resolved', True),
                        ('account_id', 'account_id_example'),
                        ('target_account_id', 'target_account_id_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/admin/reports',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_admin_reports_id_assign_to_self_post(self):
        """Test case for api_v1_admin_reports_id_assign_to_self_post

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/admin/reports/{id}/assign_to_self'.format(id='id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_admin_reports_id_get(self):
        """Test case for api_v1_admin_reports_id_get

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/admin/reports/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_admin_reports_id_reopen_post(self):
        """Test case for api_v1_admin_reports_id_reopen_post

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/admin/reports/{id}/reopen'.format(id='id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_admin_reports_id_resolve_post(self):
        """Test case for api_v1_admin_reports_id_resolve_post

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/admin/reports/{id}/resolve'.format(id='id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_admin_reports_id_unassign_post(self):
        """Test case for api_v1_admin_reports_id_unassign_post

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/admin/reports/{id}/unassign'.format(id='id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_announcements_get(self):
        """Test case for api_v1_announcements_get

        
        """
        query_string = [('with_dismissed', True)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/announcements',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_announcements_id_dismiss_post(self):
        """Test case for api_v1_announcements_id_dismiss_post

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/announcements/{id}/dismiss'.format(id='id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_announcements_id_reactions_name_delete(self):
        """Test case for api_v1_announcements_id_reactions_name_delete

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/announcements/{id}/reactions/{name}'.format(id='id_example', name='name_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_announcements_id_reactions_name_put(self):
        """Test case for api_v1_announcements_id_reactions_name_put

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/announcements/{id}/reactions/{name}'.format(id='id_example', name='name_example'),
            method='PUT',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_blocks_get(self):
        """Test case for api_v1_blocks_get

        
        """
        query_string = [('limit', 56),
                        ('max_id', 'max_id_example'),
                        ('since_id', 'since_id_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/blocks',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_bookmarks_get(self):
        """Test case for api_v1_bookmarks_get

        
        """
        query_string = [('limit', 56),
                        ('max_id', 'max_id_example'),
                        ('since_id', 'since_id_example'),
                        ('min_id', 'min_id_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/bookmarks',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_conversations_get(self):
        """Test case for api_v1_conversations_get

        
        """
        query_string = [('limit', 20),
                        ('max_id', 'max_id_example'),
                        ('since_id', 'since_id_example'),
                        ('min_id', 'min_id_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/conversations',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_conversations_id_delete(self):
        """Test case for api_v1_conversations_id_delete

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/conversations/{id}'.format(id='id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_conversations_id_read_post(self):
        """Test case for api_v1_conversations_id_read_post

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/conversations/{id}/read'.format(id='id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_custom_emojis_get(self):
        """Test case for api_v1_custom_emojis_get

        
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/custom_emojis',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_directory_get(self):
        """Test case for api_v1_directory_get

        
        """
        query_string = [('limit', 40),
                        ('offset', 0),
                        ('order', 'active'),
                        ('local', True)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/directory',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_domain_blocks_delete(self):
        """Test case for api_v1_domain_blocks_delete

        
        """
        query_string = [('domain', 'domain_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/domain_blocks',
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_domain_blocks_get(self):
        """Test case for api_v1_domain_blocks_get

        
        """
        query_string = [('limit', 56),
                        ('max_id', 'max_id_example'),
                        ('since_id', 'since_id_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/domain_blocks',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("application/form-data not supported by Connexion")
    def test_api_v1_domain_blocks_post(self):
        """Test case for api_v1_domain_blocks_post

        
        """
        api_v1_domain_blocks_post_request = openapi_server.ApiV1DomainBlocksPostRequest()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/form-data',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/domain_blocks',
            method='POST',
            headers=headers,
            data=json.dumps(api_v1_domain_blocks_post_request),
            content_type='application/form-data')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_endorsements_get(self):
        """Test case for api_v1_endorsements_get

        
        """
        query_string = [('limit', 40),
                        ('max_id', 'max_id_example'),
                        ('since_id', 'since_id_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/endorsements',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_favourites_get(self):
        """Test case for api_v1_favourites_get

        
        """
        query_string = [('limit', 'limit_example'),
                        ('max_id', 'max_id_example'),
                        ('min_id', 'min_id_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/favourites',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_featured_tags_get(self):
        """Test case for api_v1_featured_tags_get

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/featured_tags',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_featured_tags_id_delete(self):
        """Test case for api_v1_featured_tags_id_delete

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/featured_tags/{id}'.format(id='id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_featured_tags_post(self):
        """Test case for api_v1_featured_tags_post

        
        """
        api_v1_featured_tags_post_request = openapi_server.ApiV1FeaturedTagsPostRequest()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/featured_tags',
            method='POST',
            headers=headers,
            data=json.dumps(api_v1_featured_tags_post_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_featured_tags_suggestions_get(self):
        """Test case for api_v1_featured_tags_suggestions_get

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/featured_tags/suggestions',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_filters_get(self):
        """Test case for api_v1_filters_get

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/filters',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_filters_id_delete(self):
        """Test case for api_v1_filters_id_delete

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/filters/{id}'.format(id='id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_filters_id_get(self):
        """Test case for api_v1_filters_id_get

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/filters/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("application/form-data not supported by Connexion")
    def test_api_v1_filters_id_put(self):
        """Test case for api_v1_filters_id_put

        
        """
        api_v1_filters_post_request = openapi_server.ApiV1FiltersPostRequest()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/form-data',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/filters/{id}'.format(id='id_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(api_v1_filters_post_request),
            content_type='application/form-data')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("application/form-data not supported by Connexion")
    def test_api_v1_filters_post(self):
        """Test case for api_v1_filters_post

        
        """
        api_v1_filters_post_request = openapi_server.ApiV1FiltersPostRequest()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/form-data',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/filters',
            method='POST',
            headers=headers,
            data=json.dumps(api_v1_filters_post_request),
            content_type='application/form-data')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_follow_requests_get(self):
        """Test case for api_v1_follow_requests_get

        
        """
        query_string = [('limit', 40)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/follow_requests',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_follow_requests_id_authorize_post(self):
        """Test case for api_v1_follow_requests_id_authorize_post

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/follow_requests/{id}/authorize'.format(id='id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_follow_requests_id_reject_post(self):
        """Test case for api_v1_follow_requests_id_reject_post

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/follow_requests/{id}/reject'.format(id='id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_instance_activity_get(self):
        """Test case for api_v1_instance_activity_get

        
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/instance/activity',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_instance_get(self):
        """Test case for api_v1_instance_get

        
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/instance',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_instance_peers_get(self):
        """Test case for api_v1_instance_peers_get

        
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/instance/peers',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_lists_delete(self):
        """Test case for api_v1_lists_delete

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/lists',
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_lists_get(self):
        """Test case for api_v1_lists_get

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/lists',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_lists_id_accounts_delete(self):
        """Test case for api_v1_lists_id_accounts_delete

        
        """
        query_string = [('account_ids', ['account_ids_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/lists/{id}/accounts'.format(id='id_example'),
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_lists_id_accounts_get(self):
        """Test case for api_v1_lists_id_accounts_get

        
        """
        query_string = [('limit', 40),
                        ('max_id', 'max_id_example'),
                        ('since_id', 'since_id_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/lists/{id}/accounts'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_lists_id_accounts_post(self):
        """Test case for api_v1_lists_id_accounts_post

        
        """
        api_v1_lists_id_accounts_post_request = openapi_server.ApiV1ListsIdAccountsPostRequest()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/lists/{id}/accounts'.format(id='id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(api_v1_lists_id_accounts_post_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_lists_id_get(self):
        """Test case for api_v1_lists_id_get

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/lists/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_lists_post(self):
        """Test case for api_v1_lists_post

        
        """
        api_v1_lists_post_request = openapi_server.ApiV1ListsPostRequest()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/lists',
            method='POST',
            headers=headers,
            data=json.dumps(api_v1_lists_post_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_lists_put(self):
        """Test case for api_v1_lists_put

        
        """
        api_v1_lists_put_request = openapi_server.ApiV1ListsPutRequest()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/lists',
            method='PUT',
            headers=headers,
            data=json.dumps(api_v1_lists_put_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_markers_get(self):
        """Test case for api_v1_markers_get

        
        """
        query_string = [('timeline', None)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/markers',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_markers_post(self):
        """Test case for api_v1_markers_post

        
        """
        body = None
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/markers',
            method='POST',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_media_id_get(self):
        """Test case for api_v1_media_id_get

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/media/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("application/form-data not supported by Connexion")
    def test_api_v1_media_id_post(self):
        """Test case for api_v1_media_id_post

        
        """
        api_v1_media_post_request = openapi_server.ApiV1MediaPostRequest()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/form-data',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/media/{id}'.format(id='id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(api_v1_media_post_request),
            content_type='application/form-data')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("application/form-data not supported by Connexion")
    def test_api_v1_media_post(self):
        """Test case for api_v1_media_post

        
        """
        api_v1_media_post_request = openapi_server.ApiV1MediaPostRequest()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/form-data',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/media',
            method='POST',
            headers=headers,
            data=json.dumps(api_v1_media_post_request),
            content_type='application/form-data')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_mutes_get(self):
        """Test case for api_v1_mutes_get

        
        """
        query_string = [('limit', 'limit_example'),
                        ('max_id', 'max_id_example'),
                        ('since_id', 'since_id_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/mutes',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_notifications_clear_post(self):
        """Test case for api_v1_notifications_clear_post

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/notifications/clear',
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_notifications_get(self):
        """Test case for api_v1_notifications_get

        
        """
        query_string = [('limit', 20),
                        ('max_id', 'max_id_example'),
                        ('since_id', 'since_id_example'),
                        ('min_id', 'min_id_example'),
                        ('exclude_types', ['exclude_types_example']),
                        ('account_id', 'account_id_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/notifications',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_notifications_id_dismiss_post(self):
        """Test case for api_v1_notifications_id_dismiss_post

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/notifications/{id}/dismiss'.format(id='id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_notifications_id_get(self):
        """Test case for api_v1_notifications_id_get

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/notifications/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_polls_id_get(self):
        """Test case for api_v1_polls_id_get

        
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/polls/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_polls_id_post(self):
        """Test case for api_v1_polls_id_post

        
        """
        api_v1_polls_id_post_request = openapi_server.ApiV1PollsIdPostRequest()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/polls/{id}'.format(id='id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(api_v1_polls_id_post_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_preferences_get(self):
        """Test case for api_v1_preferences_get

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/preferences',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_push_subscription_delete(self):
        """Test case for api_v1_push_subscription_delete

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/push/subscription',
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_push_subscription_get(self):
        """Test case for api_v1_push_subscription_get

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/push/subscription',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_push_subscription_post(self):
        """Test case for api_v1_push_subscription_post

        
        """
        api_v1_push_subscription_post_request = openapi_server.ApiV1PushSubscriptionPostRequest()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/push/subscription',
            method='POST',
            headers=headers,
            data=json.dumps(api_v1_push_subscription_post_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_push_subscription_put(self):
        """Test case for api_v1_push_subscription_put

        
        """
        api_v1_push_subscription_put_request = openapi_server.ApiV1PushSubscriptionPutRequest()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/push/subscription',
            method='PUT',
            headers=headers,
            data=json.dumps(api_v1_push_subscription_put_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_reports_post(self):
        """Test case for api_v1_reports_post

        
        """
        api_v1_reports_post_request = openapi_server.ApiV1ReportsPostRequest()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/reports',
            method='POST',
            headers=headers,
            data=json.dumps(api_v1_reports_post_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_scheduled_statuses_get(self):
        """Test case for api_v1_scheduled_statuses_get

        
        """
        query_string = [('limit', 20),
                        ('max_id', 'max_id_example'),
                        ('since_id', 'since_id_example'),
                        ('min_id', 'min_id_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/scheduled_statuses',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_scheduled_statuses_id_delete(self):
        """Test case for api_v1_scheduled_statuses_id_delete

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/scheduled_statuses/{id}'.format(id='id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_scheduled_statuses_id_get(self):
        """Test case for api_v1_scheduled_statuses_id_get

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/scheduled_statuses/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_scheduled_statuses_id_put(self):
        """Test case for api_v1_scheduled_statuses_id_put

        
        """
        api_v1_scheduled_statuses_id_put_request = openapi_server.ApiV1ScheduledStatusesIdPutRequest()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/scheduled_statuses/{id}'.format(id='id_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(api_v1_scheduled_statuses_id_put_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_statuses_id_bookmark_post(self):
        """Test case for api_v1_statuses_id_bookmark_post

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/statuses/{id}/bookmark'.format(id='id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_statuses_id_context_get(self):
        """Test case for api_v1_statuses_id_context_get

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/statuses/{id}/context'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_statuses_id_delete(self):
        """Test case for api_v1_statuses_id_delete

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/statuses/{id}'.format(id='id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_statuses_id_favourite_post(self):
        """Test case for api_v1_statuses_id_favourite_post

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/statuses/{id}/favourite'.format(id='id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_statuses_id_favourited_by_get(self):
        """Test case for api_v1_statuses_id_favourited_by_get

        
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/statuses/{id}/favourited_by'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_statuses_id_get(self):
        """Test case for api_v1_statuses_id_get

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/statuses/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_statuses_id_mute_post(self):
        """Test case for api_v1_statuses_id_mute_post

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/statuses/{id}/mute'.format(id='id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_statuses_id_pin_post(self):
        """Test case for api_v1_statuses_id_pin_post

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/statuses/{id}/pin'.format(id='id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_statuses_id_reblog_post(self):
        """Test case for api_v1_statuses_id_reblog_post

        
        """
        api_v1_statuses_id_reblog_post_request = openapi_server.ApiV1StatusesIdReblogPostRequest()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/statuses/{id}/reblog'.format(id='id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(api_v1_statuses_id_reblog_post_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_statuses_id_reblogged_by_get(self):
        """Test case for api_v1_statuses_id_reblogged_by_get

        
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/statuses/{id}/reblogged_by'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_statuses_id_unbookmark_post(self):
        """Test case for api_v1_statuses_id_unbookmark_post

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/statuses/{id}/unbookmark'.format(id='id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_statuses_id_unfavourite_post(self):
        """Test case for api_v1_statuses_id_unfavourite_post

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/statuses/{id}/unfavourite'.format(id='id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_statuses_id_unmute_post(self):
        """Test case for api_v1_statuses_id_unmute_post

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/statuses/{id}/unmute'.format(id='id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_statuses_id_unpin_post(self):
        """Test case for api_v1_statuses_id_unpin_post

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/statuses/{id}/unpin'.format(id='id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_statuses_id_unreblog_post(self):
        """Test case for api_v1_statuses_id_unreblog_post

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/statuses/{id}/unreblog'.format(id='id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_statuses_post(self):
        """Test case for api_v1_statuses_post

        
        """
        api_v1_statuses_post_request_inner = [openapi_server.ApiV1StatusesPostRequestInner()]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'idempotency_key': 'idempotency_key_example',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/statuses',
            method='POST',
            headers=headers,
            data=json.dumps(api_v1_statuses_post_request_inner),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_suggestions_get(self):
        """Test case for api_v1_suggestions_get

        
        """
        query_string = [('limit', 40)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/suggestions',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_suggestions_id_delete(self):
        """Test case for api_v1_suggestions_id_delete

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/suggestions/{id}'.format(id='id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_timelines_home_get(self):
        """Test case for api_v1_timelines_home_get

        
        """
        query_string = [('local', False),
                        ('limit', 20),
                        ('max_id', 'max_id_example'),
                        ('since_id', 'since_id_example'),
                        ('min_id', 'min_id_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/timelines/home',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_timelines_list_list_id_get(self):
        """Test case for api_v1_timelines_list_list_id_get

        
        """
        query_string = [('limit', 20),
                        ('max_id', 'max_id_example'),
                        ('since_id', 'since_id_example'),
                        ('min_id', 'min_id_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/timelines/list/{list_id}'.format(list_id='list_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_timelines_public_get(self):
        """Test case for api_v1_timelines_public_get

        
        """
        query_string = [('local', False),
                        ('remote', False),
                        ('only_media', False),
                        ('limit', 20),
                        ('max_id', 'max_id_example'),
                        ('since_id', 'since_id_example'),
                        ('min_id', 'min_id_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/timelines/public',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_timelines_tag_hashtag_get(self):
        """Test case for api_v1_timelines_tag_hashtag_get

        
        """
        query_string = [('local', False),
                        ('remote', False),
                        ('only_media', False),
                        ('limit', 20),
                        ('max_id', 'max_id_example'),
                        ('since_id', 'since_id_example'),
                        ('min_id', 'min_id_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/timelines/tag/{hashtag}'.format(hashtag='hashtag_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_trends_get(self):
        """Test case for api_v1_trends_get

        
        """
        query_string = [('limit', 10)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/trends',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v2_search_get(self):
        """Test case for api_v2_search_get

        
        """
        query_string = [('q', 'q_example'),
                        ('limit', 20),
                        ('resolve', 'resolve_example'),
                        ('following', True),
                        ('account_id', 'account_id_example'),
                        ('max_id', 'max_id_example'),
                        ('min_id', 'min_id_example'),
                        ('type', 'type_example'),
                        ('exclude_unreviewed', True),
                        ('offset', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v2/search',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
