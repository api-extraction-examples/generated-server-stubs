from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ApiV1FiltersPostRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, context=None, expires_in=None, irreversible=None, phrase=None, whole_word=None):  # noqa: E501
        """ApiV1FiltersPostRequest - a model defined in OpenAPI

        :param context: The context of this ApiV1FiltersPostRequest.  # noqa: E501
        :type context: List[str]
        :param expires_in: The expires_in of this ApiV1FiltersPostRequest.  # noqa: E501
        :type expires_in: int
        :param irreversible: The irreversible of this ApiV1FiltersPostRequest.  # noqa: E501
        :type irreversible: bool
        :param phrase: The phrase of this ApiV1FiltersPostRequest.  # noqa: E501
        :type phrase: str
        :param whole_word: The whole_word of this ApiV1FiltersPostRequest.  # noqa: E501
        :type whole_word: bool
        """
        self.openapi_types = {
            'context': List[str],
            'expires_in': int,
            'irreversible': bool,
            'phrase': str,
            'whole_word': bool
        }

        self.attribute_map = {
            'context': 'context',
            'expires_in': 'expires_in',
            'irreversible': 'irreversible',
            'phrase': 'phrase',
            'whole_word': 'whole_word'
        }

        self._context = context
        self._expires_in = expires_in
        self._irreversible = irreversible
        self._phrase = phrase
        self._whole_word = whole_word

    @classmethod
    def from_dict(cls, dikt) -> 'ApiV1FiltersPostRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The _api_v1_filters_post_request of this ApiV1FiltersPostRequest.  # noqa: E501
        :rtype: ApiV1FiltersPostRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def context(self) -> List[str]:
        """Gets the context of this ApiV1FiltersPostRequest.

        Array of enumerable strings `home`, `notifications`, `public`, `thread`. At least one context must be specified.  # noqa: E501

        :return: The context of this ApiV1FiltersPostRequest.
        :rtype: List[str]
        """
        return self._context

    @context.setter
    def context(self, context: List[str]):
        """Sets the context of this ApiV1FiltersPostRequest.

        Array of enumerable strings `home`, `notifications`, `public`, `thread`. At least one context must be specified.  # noqa: E501

        :param context: The context of this ApiV1FiltersPostRequest.
        :type context: List[str]
        """
        allowed_values = ["home", "notifications", "public", "thread"]  # noqa: E501
        if not set(context).issubset(set(allowed_values)):
            raise ValueError(
                "Invalid values for `context` [{0}], must be a subset of [{1}]"  # noqa: E501
                .format(", ".join(map(str, set(context) - set(allowed_values))),  # noqa: E501
                        ", ".join(map(str, allowed_values)))
            )

        self._context = context

    @property
    def expires_in(self) -> int:
        """Gets the expires_in of this ApiV1FiltersPostRequest.

        Number of seconds from now the filter should expire. Otherwise, null for a filter that doesn't expire.  # noqa: E501

        :return: The expires_in of this ApiV1FiltersPostRequest.
        :rtype: int
        """
        return self._expires_in

    @expires_in.setter
    def expires_in(self, expires_in: int):
        """Sets the expires_in of this ApiV1FiltersPostRequest.

        Number of seconds from now the filter should expire. Otherwise, null for a filter that doesn't expire.  # noqa: E501

        :param expires_in: The expires_in of this ApiV1FiltersPostRequest.
        :type expires_in: int
        """

        self._expires_in = expires_in

    @property
    def irreversible(self) -> bool:
        """Gets the irreversible of this ApiV1FiltersPostRequest.

        Should the server irreversibly drop matching entities from home and notifications?  # noqa: E501

        :return: The irreversible of this ApiV1FiltersPostRequest.
        :rtype: bool
        """
        return self._irreversible

    @irreversible.setter
    def irreversible(self, irreversible: bool):
        """Sets the irreversible of this ApiV1FiltersPostRequest.

        Should the server irreversibly drop matching entities from home and notifications?  # noqa: E501

        :param irreversible: The irreversible of this ApiV1FiltersPostRequest.
        :type irreversible: bool
        """

        self._irreversible = irreversible

    @property
    def phrase(self) -> str:
        """Gets the phrase of this ApiV1FiltersPostRequest.

        Text to be filtered.  # noqa: E501

        :return: The phrase of this ApiV1FiltersPostRequest.
        :rtype: str
        """
        return self._phrase

    @phrase.setter
    def phrase(self, phrase: str):
        """Sets the phrase of this ApiV1FiltersPostRequest.

        Text to be filtered.  # noqa: E501

        :param phrase: The phrase of this ApiV1FiltersPostRequest.
        :type phrase: str
        """
        if phrase is None:
            raise ValueError("Invalid value for `phrase`, must not be `None`")  # noqa: E501

        self._phrase = phrase

    @property
    def whole_word(self) -> bool:
        """Gets the whole_word of this ApiV1FiltersPostRequest.

        Consider word boundaries?  # noqa: E501

        :return: The whole_word of this ApiV1FiltersPostRequest.
        :rtype: bool
        """
        return self._whole_word

    @whole_word.setter
    def whole_word(self, whole_word: bool):
        """Sets the whole_word of this ApiV1FiltersPostRequest.

        Consider word boundaries?  # noqa: E501

        :param whole_word: The whole_word of this ApiV1FiltersPostRequest.
        :type whole_word: bool
        """

        self._whole_word = whole_word
