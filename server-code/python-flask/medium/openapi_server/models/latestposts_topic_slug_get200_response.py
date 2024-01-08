from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class LatestpostsTopicSlugGet200Response(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, latestposts=None):  # noqa: E501
        """LatestpostsTopicSlugGet200Response - a model defined in OpenAPI

        :param latestposts: The latestposts of this LatestpostsTopicSlugGet200Response.  # noqa: E501
        :type latestposts: List[str]
        """
        self.openapi_types = {
            'latestposts': List[str]
        }

        self.attribute_map = {
            'latestposts': 'latestposts'
        }

        self._latestposts = latestposts

    @classmethod
    def from_dict(cls, dikt) -> 'LatestpostsTopicSlugGet200Response':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The _latestposts__topic_slug__get_200_response of this LatestpostsTopicSlugGet200Response.  # noqa: E501
        :rtype: LatestpostsTopicSlugGet200Response
        """
        return util.deserialize_model(dikt, cls)

    @property
    def latestposts(self) -> List[str]:
        """Gets the latestposts of this LatestpostsTopicSlugGet200Response.


        :return: The latestposts of this LatestpostsTopicSlugGet200Response.
        :rtype: List[str]
        """
        return self._latestposts

    @latestposts.setter
    def latestposts(self, latestposts: List[str]):
        """Sets the latestposts of this LatestpostsTopicSlugGet200Response.


        :param latestposts: The latestposts of this LatestpostsTopicSlugGet200Response.
        :type latestposts: List[str]
        """

        self._latestposts = latestposts