from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_store_age_rating import AppStoreAgeRating
from openapi_server.models.app_store_version_state import AppStoreVersionState
from openapi_server.models.brazil_age_rating import BrazilAgeRating
from openapi_server.models.kids_age_band import KidsAgeBand
from openapi_server import util

from openapi_server.models.app_store_age_rating import AppStoreAgeRating  # noqa: E501
from openapi_server.models.app_store_version_state import AppStoreVersionState  # noqa: E501
from openapi_server.models.brazil_age_rating import BrazilAgeRating  # noqa: E501
from openapi_server.models.kids_age_band import KidsAgeBand  # noqa: E501

class AppInfoAttributes(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, app_store_age_rating=None, app_store_state=None, brazil_age_rating=None, kids_age_band=None):  # noqa: E501
        """AppInfoAttributes - a model defined in OpenAPI

        :param app_store_age_rating: The app_store_age_rating of this AppInfoAttributes.  # noqa: E501
        :type app_store_age_rating: AppStoreAgeRating
        :param app_store_state: The app_store_state of this AppInfoAttributes.  # noqa: E501
        :type app_store_state: AppStoreVersionState
        :param brazil_age_rating: The brazil_age_rating of this AppInfoAttributes.  # noqa: E501
        :type brazil_age_rating: BrazilAgeRating
        :param kids_age_band: The kids_age_band of this AppInfoAttributes.  # noqa: E501
        :type kids_age_band: KidsAgeBand
        """
        self.openapi_types = {
            'app_store_age_rating': AppStoreAgeRating,
            'app_store_state': AppStoreVersionState,
            'brazil_age_rating': BrazilAgeRating,
            'kids_age_band': KidsAgeBand
        }

        self.attribute_map = {
            'app_store_age_rating': 'appStoreAgeRating',
            'app_store_state': 'appStoreState',
            'brazil_age_rating': 'brazilAgeRating',
            'kids_age_band': 'kidsAgeBand'
        }

        self._app_store_age_rating = app_store_age_rating
        self._app_store_state = app_store_state
        self._brazil_age_rating = brazil_age_rating
        self._kids_age_band = kids_age_band

    @classmethod
    def from_dict(cls, dikt) -> 'AppInfoAttributes':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppInfo_attributes of this AppInfoAttributes.  # noqa: E501
        :rtype: AppInfoAttributes
        """
        return util.deserialize_model(dikt, cls)

    @property
    def app_store_age_rating(self) -> AppStoreAgeRating:
        """Gets the app_store_age_rating of this AppInfoAttributes.


        :return: The app_store_age_rating of this AppInfoAttributes.
        :rtype: AppStoreAgeRating
        """
        return self._app_store_age_rating

    @app_store_age_rating.setter
    def app_store_age_rating(self, app_store_age_rating: AppStoreAgeRating):
        """Sets the app_store_age_rating of this AppInfoAttributes.


        :param app_store_age_rating: The app_store_age_rating of this AppInfoAttributes.
        :type app_store_age_rating: AppStoreAgeRating
        """

        self._app_store_age_rating = app_store_age_rating

    @property
    def app_store_state(self) -> AppStoreVersionState:
        """Gets the app_store_state of this AppInfoAttributes.


        :return: The app_store_state of this AppInfoAttributes.
        :rtype: AppStoreVersionState
        """
        return self._app_store_state

    @app_store_state.setter
    def app_store_state(self, app_store_state: AppStoreVersionState):
        """Sets the app_store_state of this AppInfoAttributes.


        :param app_store_state: The app_store_state of this AppInfoAttributes.
        :type app_store_state: AppStoreVersionState
        """

        self._app_store_state = app_store_state

    @property
    def brazil_age_rating(self) -> BrazilAgeRating:
        """Gets the brazil_age_rating of this AppInfoAttributes.


        :return: The brazil_age_rating of this AppInfoAttributes.
        :rtype: BrazilAgeRating
        """
        return self._brazil_age_rating

    @brazil_age_rating.setter
    def brazil_age_rating(self, brazil_age_rating: BrazilAgeRating):
        """Sets the brazil_age_rating of this AppInfoAttributes.


        :param brazil_age_rating: The brazil_age_rating of this AppInfoAttributes.
        :type brazil_age_rating: BrazilAgeRating
        """

        self._brazil_age_rating = brazil_age_rating

    @property
    def kids_age_band(self) -> KidsAgeBand:
        """Gets the kids_age_band of this AppInfoAttributes.


        :return: The kids_age_band of this AppInfoAttributes.
        :rtype: KidsAgeBand
        """
        return self._kids_age_band

    @kids_age_band.setter
    def kids_age_band(self, kids_age_band: KidsAgeBand):
        """Sets the kids_age_band of this AppInfoAttributes.


        :param kids_age_band: The kids_age_band of this AppInfoAttributes.
        :type kids_age_band: KidsAgeBand
        """

        self._kids_age_band = kids_age_band
