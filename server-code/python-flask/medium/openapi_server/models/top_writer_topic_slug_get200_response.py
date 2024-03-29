from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class TopWriterTopicSlugGet200Response(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, top_writers=None):  # noqa: E501
        """TopWriterTopicSlugGet200Response - a model defined in OpenAPI

        :param top_writers: The top_writers of this TopWriterTopicSlugGet200Response.  # noqa: E501
        :type top_writers: List[str]
        """
        self.openapi_types = {
            'top_writers': List[str]
        }

        self.attribute_map = {
            'top_writers': 'top_writers'
        }

        self._top_writers = top_writers

    @classmethod
    def from_dict(cls, dikt) -> 'TopWriterTopicSlugGet200Response':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The _top_writer__topic_slug__get_200_response of this TopWriterTopicSlugGet200Response.  # noqa: E501
        :rtype: TopWriterTopicSlugGet200Response
        """
        return util.deserialize_model(dikt, cls)

    @property
    def top_writers(self) -> List[str]:
        """Gets the top_writers of this TopWriterTopicSlugGet200Response.


        :return: The top_writers of this TopWriterTopicSlugGet200Response.
        :rtype: List[str]
        """
        return self._top_writers

    @top_writers.setter
    def top_writers(self, top_writers: List[str]):
        """Sets the top_writers of this TopWriterTopicSlugGet200Response.


        :param top_writers: The top_writers of this TopWriterTopicSlugGet200Response.
        :type top_writers: List[str]
        """

        self._top_writers = top_writers
