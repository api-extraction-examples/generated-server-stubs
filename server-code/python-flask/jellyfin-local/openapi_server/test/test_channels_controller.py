import unittest

from flask import json

from openapi_server.models.base_item_dto_query_result import BaseItemDtoQueryResult  # noqa: E501
from openapi_server.models.channel_features import ChannelFeatures  # noqa: E501
from openapi_server.models.item_fields import ItemFields  # noqa: E501
from openapi_server.models.item_filter import ItemFilter  # noqa: E501
from openapi_server.test import BaseTestCase


class TestChannelsController(BaseTestCase):
    """ChannelsController integration test stubs"""

    def test_get_all_channel_features(self):
        """Test case for get_all_channel_features

        Get all channel features.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Channels/Features',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_channel_features(self):
        """Test case for get_channel_features

        Get channel features.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Channels/{channel_id}/Features'.format(channel_id='channel_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_channel_items(self):
        """Test case for get_channel_items

        Get channel items.
        """
        query_string = [('folderId', 'folder_id_example'),
                        ('userId', 'user_id_example'),
                        ('startIndex', 56),
                        ('limit', 56),
                        ('sortOrder', 'sort_order_example'),
                        ('filters', [openapi_server.ItemFilter()]),
                        ('sortBy', 'sort_by_example'),
                        ('fields', [openapi_server.ItemFields()])]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Channels/{channel_id}/Items'.format(channel_id='channel_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_channels(self):
        """Test case for get_channels

        Gets available channels.
        """
        query_string = [('userId', 'user_id_example'),
                        ('startIndex', 56),
                        ('limit', 56),
                        ('supportsLatestItems', True),
                        ('supportsMediaDeletion', True),
                        ('isFavorite', True)]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Channels',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_latest_channel_items(self):
        """Test case for get_latest_channel_items

        Gets latest channel items.
        """
        query_string = [('userId', 'user_id_example'),
                        ('startIndex', 56),
                        ('limit', 56),
                        ('filters', [openapi_server.ItemFilter()]),
                        ('fields', [openapi_server.ItemFields()]),
                        ('channelIds', ['channel_ids_example'])]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Channels/Items/Latest',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
