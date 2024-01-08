import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.country_info import CountryInfo  # noqa: E501
from openapi_server.models.culture_dto import CultureDto  # noqa: E501
from openapi_server.models.localization_option import LocalizationOption  # noqa: E501
from openapi_server.models.parental_rating import ParentalRating  # noqa: E501
from openapi_server import util


def get_countries():  # noqa: E501
    """Gets known countries.

     # noqa: E501


    :rtype: Union[List[CountryInfo], Tuple[List[CountryInfo], int], Tuple[List[CountryInfo], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_cultures():  # noqa: E501
    """Gets known cultures.

     # noqa: E501


    :rtype: Union[List[CultureDto], Tuple[List[CultureDto], int], Tuple[List[CultureDto], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_localization_options():  # noqa: E501
    """Gets localization options.

     # noqa: E501


    :rtype: Union[List[LocalizationOption], Tuple[List[LocalizationOption], int], Tuple[List[LocalizationOption], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_parental_ratings():  # noqa: E501
    """Gets known parental ratings.

     # noqa: E501


    :rtype: Union[List[ParentalRating], Tuple[List[ParentalRating], int], Tuple[List[ParentalRating], int, Dict[str, str]]
    """
    return 'do some magic!'
